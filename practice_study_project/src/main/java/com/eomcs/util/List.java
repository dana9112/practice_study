package com.eomcs.util;

// 일반화(Generaliztion)
// 서브 클래스의 공통 분모를 추출하여 수퍼 클래스로 정의하고 상속 관계를 맺는 것.
// 다형적 변수(Polymorphic Vriables)
// Handler에서 사용할 목록 관리 객체를 수퍼 클래스의 레퍼런스로 선언하는 것.
// 이를 통해 List의 서브 객체로 교체하기 쉽도록 만드는 것.
// 의존성 주입(DI; Dependecy Infection)
// Handler가 의존하는 객체를 내부에서 생성하지 않고 생성자를 통해 외부에서 주입 받는 것.
// 이를 통해 의존 객체 교체가 쉽도록 만드는 것.

// Generalization 1단계:
// => ArrayList와 LinkedList 사이의 공통 분모를 추출하여 수퍼 클래스를 정의
// => ArrayList와 LinkedList는 이렇게 정의한 수퍼 클래스를 상속 받는다.

public class List<E> {
  protected int size;

  public int size() {
    return this.size;
  }

  // ArrayList나 LinkedList는 동작 방법이 다르기 때문에
  // 여기서 구현할 필요가 없다.

  public void add(E e) {}

  public void add(int index, E value) {}

  public E get(int index) {
    return null;
  }

  public E set(int index, E e) {
    return null;
  }

  public E remove(int index) {
    return null;
  }

  public Object[] toArray() {
    return null;
  }

  public E[] toArray(E[] arr) {
    return null;
  }

}
