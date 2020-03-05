package com.eomcs.util;

public abstract class AbstractList<E> implements List<E> {

  protected int size;

  @Override
  public int size() {
    return size;
  }


  @Override
  public Iterator<E> iterator() {
    // this = 인스턴스 주소;

    // anonymous class : 인스턴스는 "한 개"만 생성할거면 익명 클래스로 정의하라
    // 정의하자마자 즉시 인스턴스를 만들어 줘야 함
    // 바깥 클래스의 파라미터를 만들어 줘야 함

    // 얘는 수퍼 클래스 아니면 인터페이스이다. () -> 생성자는 Object의 디폴트 값을 받는다.
    return new Iterator<E>() {
      // Iterator<E> obj = new Iterator<E>() // return obj와 합치면 위와 같다.

      List<E> list;
      int cursor;

      // 익명 클래스는 생성자를 만들 수 없기 때문에
      // 인스턴스 필드를 초기화시키기 위해서는
      // 다음과 같이 인스턴스 블록을 사용해야 한다.
      // (물론 단순히 값을 할당하는 경우에는 인스턴스 블록에 넣지 않고, 필드 선언에 바로 할당 연산자를 사용할 수 있다.)

      {
        // 로컬 클래스는 인스턴스 멤버가 아니기 때문에
        this.list = AbstractList.this;
      }

      @Override
      public boolean hasNext() {
        return cursor < this.list.size();
      }

      @Override
      public E next() {
        return list.get(cursor++);
      }

    }; // 클래스를 정의함과 동시에 인스턴스 값을 할당했기 때문에
    // 무조건 ; 를 넣어줘야 한다.

    // return obj; // 위의 Iterator<E> obj = new Iterator<E>() 와 합칠 수 있다.
  }

}
