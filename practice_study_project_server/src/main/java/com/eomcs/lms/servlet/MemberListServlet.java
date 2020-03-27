package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;
import com.eomcs.util.RequestMapping;

@Component
public class MemberListServlet {

  MemberService memberService;

  public MemberListServlet(MemberService memberService) {
    this.memberService = memberService;
  }

  @RequestMapping("/member/list")
  public void service(Map<String, String> parmas, PrintStream out) throws Exception {

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("   <meta charset ='UTF-8'>");
    out.println("   <title> 회원 목록 </title>");
    out.println("</head>");
    out.println("<body>");
    out.println("   <h1> 회원목록 </h1>");
    out.println("   <a href='/member/serach'>검색</a>");
    out.println("   <a href='/member/addForm'>추가</a><br>");
    out.println("   <table border='1'>");
    out.println("   <tr>");
    out.println("   <th>번호</th>");
    out.println("   <th>이름</th>");
    out.println("   <th>이메일</th>");
    out.println("   <th>전화번호</th>");
    out.println("   <th>등록일</th>");
    out.println("   </tr>");

    List<Member> members = memberService.list();
    for (Member m : members) {
      out.printf("<tr><td>%d</td> " //
          + "<td><a href='/member/detail?no=%d'>%s</a></td> "//
          + "<td>%s</td> "//
          + "<td>%s</td> "//
          + "<td>%s</td></tr>\n", //
          m.getNo(), m.getNo(), m.getName(), m.getEmail(), m.getTel(), m.getRegisteredDate());
    }
    out.println("</body>");
    out.println("</html>");

  }
}