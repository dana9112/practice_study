package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.util.Prompt;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    Prompt prompt = new Prompt(keyboard);

    BoardHandler boardHandler = new BoardHandler(prompt);
    LessonHandler lesssonHandler수업 = new LessonHandler(prompt);
    MemberHandler memberHandler = new MemberHandler(prompt);

    String command;

    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          lesssonHandler수업.addLesson();
          break;
        case "/lesson/list":
          lesssonHandler수업.listLesson();
          break;
        case "/lesson/detail":
          lesssonHandler수업.detailLesson();
          break;
        case "/lesson/update":
          lesssonHandler수업.updateLesson();
          break;
        case "/lesson/delete":
          lesssonHandler수업.deleteLesson();
          break;
        case "/member/add":
          memberHandler.addMember();
          break;
        case "/member/list":
          memberHandler.listMember();
          break;
        case "/member/detail":
          memberHandler.detailMember();
          break;
        case "/member/update":
          memberHandler.updateMember();
          break;
        case "/member/delete":
          memberHandler.deleteMember();
          break;
        case "/board/add":
          boardHandler.addBoard();
          break;
        case "/board/list":
          boardHandler.listBoard();
          break;
        case "/board/detail":
          boardHandler.detailBoard();
          break;
        case "/board/update":
          boardHandler.updateBoard();
          break;
        case "/board/delete":
          boardHandler.deleteBoard();
          break;

        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }

    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");

    keyboard.close();
  }
}


