// 게시글 인덱스로 객체를 찾는 대신에
// 게시글을 입력할 때 등록한 번호로 객체를 찾도록 변경한다.
package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Board;

public class BoardListCommand implements Command {
  List<Board> boardList;

  public BoardListCommand(List<Board> list) {
    this.boardList = list;

  }

  @Override
  public void execute() {
    // iterator 준비
    Iterator<Board> iterator = boardList.iterator();

    // iterator 값 꺼내기
    while (iterator.hasNext()) {
      Board b = iterator.next();
      System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
}


