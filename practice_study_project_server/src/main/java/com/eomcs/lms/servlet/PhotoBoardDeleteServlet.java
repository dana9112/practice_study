package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.DataLoaderListener;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.util.Prompt;

public class PhotoBoardDeleteServlet implements Servlet {

  PhotoBoardDao photoBoardDao;
  PhotoFileDao photoFileDao;

  public PhotoBoardDeleteServlet(PhotoBoardDao photoBoardDao, PhotoFileDao photoFileDao) {
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;
  }


  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    int no = Prompt.getInt(in, out, "번호? ");

    // 사진 게시글을 삭제하기 전에 먼저 자식 테이블에 있는
    // 첨부 파일 데이터를 삭제한다.
    photoFileDao.deleteAll(no);

    DataLoaderListener.con.setAutoCommit(false);

    try {
      if (photoBoardDao.delete(no) == 0) {
        throw new Exception("해당 번호의 사진 게시물이 없습니다.");
      }
      DataLoaderListener.con.commit();
      out.println("사진 게시글을 삭제했습니다.");

    } catch (Exception e) {
      out.println(e.getMessage());
      DataLoaderListener.con.rollback();
    } finally {
      DataLoaderListener.con.setAutoCommit(true);
    }
  }

}
