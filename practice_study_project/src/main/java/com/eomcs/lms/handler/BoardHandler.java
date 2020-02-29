// 게시글 인덱스로 객체를 찾는 대신에
// 게시글을 입력할 때 등록한 번호로 객체를 찾도록 변경한다.
package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  ArrayList<Board> boardList;

  Prompt prompt;

  public BoardHandler(Prompt prompt) {
    this.prompt = prompt;
    boardList = new ArrayList<>();
  }

  public void listBoard() {
    Board[] arr = this.boardList.toArray(new Board[this.boardList.size()]);
    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public void addBoard() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    boardList.add(board);
    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
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

  public void updateBoard() {

    int index = indexOfBoard(prompt.inputInt("번호? "));
    if (index == -1) {
      System.out.println("게시글이 유효하지 않습니다.");
      return;
    }
    Board oldBoard = boardList.get(index);
    Board newBoard = new Board();

    newBoard.setNo(oldBoard.getNo());
    newBoard.setTitle(
        prompt.inputString(String.format("내용(%s)? ", oldBoard.getTitle()), oldBoard.getTitle()));
    newBoard.setDate(new Date(System.currentTimeMillis()));
    newBoard.setViewCount(oldBoard.getViewCount());

    if (oldBoard.equals(newBoard)) {
      System.out.println("게시물 변경을 취소하였습니다.");
    }

    this.boardList.set(index, newBoard);
    System.out.println("게시물을 변경했습니다.");
  }

  public void deleteBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));
    if (index == -1) {
      System.out.println("게시글이 유효하지 않습니다.");
      return;
    }

    this.boardList.remove(index);
    System.out.println("게시글을 삭제했습니다.");
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


