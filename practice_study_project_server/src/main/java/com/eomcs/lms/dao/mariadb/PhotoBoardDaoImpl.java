package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.util.ConnectionFactory;

public class PhotoBoardDaoImpl implements PhotoBoardDao {

  ConnectionFactory conFactory;

  public PhotoBoardDaoImpl(ConnectionFactory conFactory) {
    this.conFactory = conFactory;
  }

  @Override
  public int insert(PhotoBoard photoBoard) throws Exception { // photoBoar의 주소를 가지고 오는 것이다. (객체를 가지고
                                                              // 오는게 아니고)
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {


      int result = stmt.executeUpdate("insert into lms_photo(titl, lesson_id) values('" //
          + photoBoard.getTitle() + "'," + photoBoard.getLesson().getNo() + ")", //
          Statement.RETURN_GENERATED_KEYS // insert 후에 PK 값 리턴 받기
      );

      // 인서트 한 후에 꺼내기
      // 주소를 담아서 나중에 꺼낼 수 있도록 하는 것
      // auto-increament PK 값을 꺼내기 위한 준비를 한다.
      try (ResultSet generatedKeySet = stmt.getGeneratedKeys()) {
        // PK 컬럼의 값을 가져온다.
        generatedKeySet.next();

        // 가져온 PK 컬럼의 값을 PhotoBoard 객체에 거꾸로 답는다.
        photoBoard.setNo(generatedKeySet.getInt(1));

      }

      return result;
    }
  }

  @Override
  public List<PhotoBoard> findAllByLessonNo(int lessonNo) throws Exception {
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();

        // MariaDB의 lms_PhotoBoard 테이블에 있는 데이터를 가져올 도구를 준비
        ResultSet rs = stmt.executeQuery( //
            "select photo_id, titl, cdt, vw_cnt, lesson_id" //
                + " from lms_photo " //
                + " where lesson_id=" + lessonNo //
                + " order by photo_id desc")) {

      ArrayList<PhotoBoard> list = new ArrayList<>();

      // ResultSet 도구를 사용하여 데이터를 하나씩 가져온다.
      while (rs.next()) { // 데이터를 한 개 가져왔으면 true를 리턴한다.
        PhotoBoard photoBoard = new PhotoBoard();

        photoBoard.setNo(rs.getInt("Photo_id"));
        photoBoard.setTitle(rs.getString("titl"));
        photoBoard.setCreatedDate(rs.getDate("cdt"));
        photoBoard.setViewCount(rs.getInt("vw_cnt"));

        list.add(photoBoard);
      }

      return list;
    }
  }


  @Override
  public PhotoBoard findByNo(int no) throws Exception {
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select" //
                + " p.photo_id," //
                + " p.titl," //
                + " p.cdt," //
                + " p.vw_cnt," //
                + " l.lesson_id,"//
                + " l.titl lesson_title"//
                + " from lms_photo p"//
                + " inner join lms_lesson l on p.lesson_id=l.lesson_id"//
                + " where photo_id=" + no)) {

      if (rs.next()) { // 데이터를 한 개 가져왔으면 true를 리턴한다.
        // 조인 결과 중에서 사진 게시글 결과를 PhotoBaord에 저장한다.
        PhotoBoard photoBoard = new PhotoBoard();
        photoBoard.setNo(rs.getInt("Photo_id"));
        photoBoard.setTitle(rs.getString("titl"));
        photoBoard.setCreatedDate(rs.getDate("cdt"));
        photoBoard.setViewCount(rs.getInt("vw_cnt"));

        // 조인 결과 중에서 수업 데이터를 Lesson에 저장한다.
        Lesson lesson = new Lesson();
        lesson.setNo(rs.getInt("lesson_id"));
        lesson.setTitle(rs.getString("lesson_title"));

        // Lesson을 PhotoBoard에 저장한다.
        photoBoard.setLesson(lesson);

        return photoBoard;

      } else {
        return null;
      }
    }
  }

  @Override
  public int update(PhotoBoard photoBoard) throws Exception {
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate(//
          "update lms_photo set titl = '" + photoBoard.getTitle() + "' where photo_id="
              + photoBoard.getNo());

      return result;
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (Connection con = conFactory.getConnection(); //
        Statement stmt = con.createStatement()) {
      int result = stmt.executeUpdate("delete from lms_photo " + " where photo_id=" + no);
      return result;
    }
  }

}
