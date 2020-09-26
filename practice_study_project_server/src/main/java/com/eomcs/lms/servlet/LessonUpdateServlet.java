package com.eomcs.lms.servlet;

<<<<<<< HEAD
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import org.springframework.context.ApplicationContext;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;

@WebServlet("/lesson/update")
public class LessonUpdateServlet extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    try {
      res.setContentType("text/html;charset=UTF-8");
      PrintWriter out = res.getWriter();

      ServletContext servletContext = req.getServletContext();
      ApplicationContext iocContainer =
          (ApplicationContext) servletContext.getAttribute("iocContainer");
      LessonService lessonService = iocContainer.getBean(LessonService.class);

      Lesson lesson = new Lesson();
      lesson.setNo(Integer.parseInt(req.getParameter("no")));
      lesson.setTitle(req.getParameter("title"));
      lesson.setDescription(req.getParameter("description"));
      lesson.setStartDate(Date.valueOf(req.getParameter("startDate")));
      lesson.setEndDate(Date.valueOf(req.getParameter("endDate")));
      lesson.setTotalHours(Integer.parseInt(req.getParameter("totalHours")));
      lesson.setDayHours(Integer.parseInt(req.getParameter("dayHours")));

      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<meta charset='UTF-8'>");
      out.println("<meta http-equiv='refresh' content='2;url=list'>");
      out.println("<title>강의 변경</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>강의 변경 결과</h1>");

      if (lessonService.update(lesson) > 0) {
        out.println("<p>강의를 변경했습니다.</p>");

      } else {
        out.println("<p>변경에 실패했습니다.</p>");
      }

      out.println("</body>");
      out.println("</html>");
    } catch (Exception e) {
      throw new ServletException(e);
=======
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateServlet implements Servlet {

  List<Lesson> lessons;

  public LessonUpdateServlet(List<Lesson> lessons) {
    this.lessons = lessons;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    Lesson lesson = (Lesson) in.readObject();

    int index = -1;
    for (int i = 0; i < lessons.size(); i++) {
      if (lessons.get(i).getNo() == lesson.getNo()) {
        index = i;
        break;
      }
    }

    if (index != -1) {
      lessons.set(index, lesson);
      out.writeUTF("OK");
    } else {
      out.writeUTF("FAIL");
      out.writeUTF("해당 번호의 수업이 없습니다.");
>>>>>>> aaaf26f4768e15e5c797d24b77a637e2ae21fe1b
    }
  }
}
