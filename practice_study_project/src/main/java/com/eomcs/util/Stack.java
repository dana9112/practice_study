package com.eomcs.util;

import java.util.Arrays;

public class Stack<E> implements Cloneable {

  private static final int DEFAULT_CAPACITY = 10;
  Object[] elementDate;
  int size;

  public Stack() {
    this.elementDate = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  public void push(E value) {
    if (this.size == elementDate.length) {
      grow();
    }
    this.elementDate[size++] = value;
  }

  private void grow() {
    this.elementDate = Arrays.copyOf(elementDate, newCapacity());
  }

  private int newCapacity() {
    int oldCapacity = elementDate.length;
    return oldCapacity + (oldCapacity >> 1);
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    if (this.size == 0)
      return null;
    E value = (E) this.elementDate[--this.size];
    this.elementDate[this.size] = null;
    return value;
  }


  public boolean empty() {
    return this.size == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() {

    try {
      Stack<E> temp = (Stack<E>) super.clone();

      Object[] arr = new Object[this.size];
      for (int i = 0; i < this.size; i++) {
        arr[i] = this.elementDate[i];
      }

      temp.elementDate = arr;

      return temp;
    } catch (CloneNotSupportedException ex) {
      System.out.println(ex);
      return null;

    }
  }

  public Iterator<E> iterator() {
    // this = 인스턴스 주소;

    // annoymous class
    // 인스턴스를 한 개만 생성한다면 로컬(중첩) 클래스를 익명 클래스로 정의하라

    return new Iterator<E>() {

      // 단순히 값을 할당하는 경우에는 인스턴스 블록에 넣지 않고,
      // 필드 선언에 바로 할당 연산자를 사용할 수 있다.
      Stack<E> stack = Stack.this.clone();


      @Override
      public boolean hasNext() {
        return !stack.empty();
      }

      @Override
      public E next() {
        return stack.pop();
      }
    };
  }

}


/*
 * static void m1() { // 스태틱 메서드는 다음과 같이 클래스 이름으로 바로 호출 할 수 있기 때문에 this 변수가 없다. // 예) Stack.m1();
 *
 * // 스태틱 메서드에서 로컬 클래스를 정의한다면, // 그 로컬 클래스는 바깥 클래스의 인스턴스를 직접 접근할 수 없다.
 *
 * class A { A() { Stack s; //s = Stack.this; // 이 로컬 클래스는 m1()에서 사용할 것이다. // m1()은 바깥 클래스의 인스턴스 주소를
 * 모른다. // 그런데 로컬 클래스에서 위와 같이 바깥클래스의 인스턴스를 사용하려 한다면 문제가 될 것이다. // 이런 상황을 방지하고자 자바는 컴파일 오류를 발생시킨다. }
 *
 * } }
 */


