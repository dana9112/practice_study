package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.RequestMapping;

@Component
public class LessonUpdateFormServlet {

  LessonService lessonService;

  public LessonUpdateFormServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @RequestMapping("/lesson/update")
  public void service(Map<String, String> params, PrintStream out) throws Exception {

    int no = Integer.parseInt(params.get("no"));
    Lesson lesson = lessonService.get(no);

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>게시글 변경</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>게시물 변경</h1>");

    if (lesson == null) {
      out.println("<p>해당 번호의 강의가 없습니다.</p>");
    } else {

      out.println("<form action='/lesson/update'>");
      out.printf("제목: <input name='no' readonly type='text' value='%d'><br>\n", lesson.getNo());
      out.println("강의명:<br>");
      out.printf("<textarea name='title' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getTitle());
      out.printf("내용: <br>");
      out.printf("<textarea name='description' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getDescription());
      out.printf("강의 시작일: <br>");
      out.printf("<textarea name='startDate' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getStartDate());
      out.printf("강의 종료일: <br>");
      out.printf("<textarea name='endDate' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getEndDate());
      out.printf("총 강의시간: <br>");
      out.printf("<textarea name='totalHours' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getTotalHours());
      out.printf("일 강의시간: <br>");
      out.printf("<textarea name='dayHours' rows='5' cols='60'>%s</textarea><br>\n",
          lesson.getDayHours());
      out.println("<button>변경</button>");
      out.println("</form>");
    }
    out.println("</body>");
    out.println("</html>");

  }
}