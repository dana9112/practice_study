// 게시글 인덱스로 객체를 찾는 대신에
// 게시글을 입력할 때 등록한 번호로 객체를 찾도록 변경한다.
package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardDetailCommand implements Command {
  List<Board> boardList;

  Prompt prompt;

  public BoardDetailCommand(Prompt prompt, List<Board> list) {
    this.prompt = prompt;
    this.boardList = list;

  }

  @Override
  public void execute() {
    int index = indexOfBoard(prompt.inputInt("번호? "));
    if (index == -1) {
      System.out.println("게시물 인덱스가 유효하지 않습니다.");
      return;
    }
    Board board = this.boardList.get(index);
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }

  private int indexOfBoard(int no) {
    for (int i = 0; i < this.boardList.size(); i++) {
      if (boardList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }

}


