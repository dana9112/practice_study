// 게시글 인덱스로 객체를 찾는 대신에
// 게시글을 입력할 때 등록한 번호로 객체를 찾도록 변경한다.
package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;

public class BoardHandler {

  ArrayList<Board> boardList;

  Scanner input;

  public BoardHandler(Scanner input) {
    this.input = input;
    boardList = new ArrayList<>();
  }

  public void listBoard() {
    // BoardList의 배열에 보관된 값을 받을 배열을 준비한다.
    Board[] arr = new Board[this.boardList.size()];

    // toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.boardList.toArray(arr);

    for (Board b : arr) {
      // Board b = (Board) obj; // !이해가 안되는 부분! // 생략할 수 있음
      System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(input.nextInt());
    input.nextLine();

    System.out.print("내용? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    boardList.add(board);
    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
    System.out.print("번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거


    // 게시글 번호로 객체를 찾는다.
    int index = indexOfBoard(no);
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
    System.out.print("번호? ");
    int no = input.nextInt();
    input.nextLine();

    int index = indexOfBoard(no);
    /*
    for (int i = 0; i < boardList.size(); i++) {
      Board temp = boardList.get(i);
      if (temp.getNo() == no) {
        oldBoard = temp;
        index = i;
        break;
      }
    }
*/
    
    if (index == -1) {
      System.out.println("게시글이 유효하지 않습니다.");
      return;
    }
    Board oldBoard = boardList.get(index);
    System.out.printf("내용(%s)? ", oldBoard.getTitle());
    String title = input.nextLine();

    if (title.length() == 0) {
      System.out.println("게시글 변경을 취소했습니다.");
      return;
    }

    Board newBoard = new Board();
    newBoard.setNo(oldBoard.getNo());
    newBoard.setTitle(title);
    newBoard.setDate(new Date(System.currentTimeMillis()));
    newBoard.setViewCount(oldBoard.getViewCount());

    this.boardList.set(index, newBoard);
    System.out.println("게시물을 변경했습니다.");
  }

  public void deleteBoard() {
    System.out.print("번호?? ");
    int no = input.nextInt();
    input.nextLine();

    int index = indexOfBoard(no);
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


