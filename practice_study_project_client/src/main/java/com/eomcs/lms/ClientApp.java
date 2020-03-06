package com.eomcs.lms;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 수업 관리 시스템입니다.");

    String serverAddr = null;
    int port = 0;

    // 키보드 스캐너 준비
    Scanner keyScan = new Scanner(System.in);

    try {
      System.out.print("서버? ");
      serverAddr = keyScan.nextLine();

      System.out.print("포트? ");
      port = Integer.parseInt(keyScan.nextLine());

    } catch (Exception e) {
      System.out.println("서버 주소 또는 포트 번호가 유효하지 않습니다.");
      keyScan.close();
      return;
    }

    try (// 서버와 연결
        Socket socket = new Socket(serverAddr, port);

        // 소켓을 통해 데이터를 읽고 쓰는 도구를 준비한다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {


      System.out.println("서버와 연결되었음!");
      System.out.print("서버에 보낼 메시지: ");
      String sendMsg = keyScan.nextLine();
      // 서버가 메시지를 전송한다.
      // => 서버가 메시지를 받을 때까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      out.println(sendMsg);
      System.out.println("서버에 메시지를 전송하였음!");

      // 서버가 응답한 메시지를 수신한다.
      // => 서버로부터 한 줄의 메시지를 받을 때까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      String message = in.nextLine();
      System.out.println("서버로부터 메시지를 수신하였음!");

      // 서버가 받은 메시지를 출력한다.
      System.out.println("서버: " + message);
    } catch (Exception e) {
      System.out.println("예외발생: ");
      e.printStackTrace(); // 예외가 왜 발생했는지 출력해주는 것
    }
    keyScan.close();
  }
}
