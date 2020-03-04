package com.eomcs.util;

import java.util.Arrays;

public class Stack<E> implements Cloneable {

  // 1. 데이터를 저장할 레퍼런스 배열과 상수 필드를 준비한다.
  private static final int DEFAULT_CAPACITY = 10;
  Object[] elementDate;
  int size;

  // 2. 레퍼런스 배열을 초기화시키는 생성자를 만든다.
  public Stack() {
    this.elementDate = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  // 3) push() 추가
  // 4) push() 변경: 배열이 꽉찼을 때 배열의 크기를 증가시키는 코드를 추가한다.
  public void push(E value) {
    if (this.size == elementDate.length) {
      grow();
    }
    this.elementDate[size++] = value;
  }

  // 5) push() 변경: 배열 크기를 늘리는 코드를 별도의 메서드(grow())로 분리한다.(리팩토링)
  private void grow() {
    this.elementDate = Arrays.copyOf(elementDate, newCapacity());
  }

  // 6) grow() 변경: 새 배열 크기를 계산하는 코드를 별도의 메서드(newCapacity())로 분리한다.(리팩토링)
  private int newCapacity() {
    int oldCapacity = elementDate.length;
    return oldCapacity + (oldCapacity >> 1);
  }

  // 7) pop() 추가
  @SuppressWarnings("unchecked")
  public E pop() {
    if (this.size == 0)
      return null;
    E value = (E) this.elementDate[--this.size];
    this.elementDate[this.size] = null;
    return value;
  }


  // 8) empty() 추가
  public boolean empty() {
    return this.size == 0;
  }

  // 9) Object의 clone() 메서드 재정의 : shallow copy
  // Object.clone()의 'shallow copy' 이용하여 스택 객체 복사하기
  // => 객체의 인스턴스 변수를 그대로 복제한다.
  // => 인스턴스 변수가 가리키는 객체는 복제하지 않는다.
  //
  // 문제점?
  // => 따라서 인스턴스 변수인 elementData가 가리키는 배열은 복제하지 않는다.
  // => 그래서 배열의 값을 바꾸면 원본 스택에도 영향을 끼친다.

  /*
   * @Override public Stack clone() { try { return (Stack) super.clone(); } catch
   * (CloneNotSupportedException ex) { // Object의 clone() 메서드는 // 복제가 허용된 객체에 대해서만 해당 인스턴스 변수를 복제한다.
   * // 복제가 허용되지 않은 객체에 대해서 clone()을 호출하며 // CloneNotSupportedException 실행 오류가 발생한다. // 해결책? // =>
   * 해당 클래스의 객체를 복제할 수 있다고 표시하라. // => 방법: Cloneable 인터페이스를 지정한다. // ...예) class My implements
   * Cloneable {...} // System.out.println(ex); return null; } }
   *
   */

  // 10) Object의 clone() 메서드 변경 : deep copy
  // 'deep copy'를 이용하여 객체 복제하기
  // => 데이터가 들어있는 배열도 그대로 복제한다.
  // => 따라서 배열의 값을 바꾸더라도 원본 객체에 영향을 끼치지 않는다.

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() {

    try {
      // 1) 'shallow copy'를 통해 이 객체의 인스턴스 변수는 그대로 복제한다.
      Stack<E> temp = (Stack<E>) super.clone();

      // 2) elementData 배열을 복제한다.
      // => 배열만 복제하고 그 배열에 저장된 객체까지는 복제하지 않는다.
      // => 어디까지 복제할 것인지는 상황에 따라 결정한다.
      Object[] arr = new Object[this.size];
      for (int i = 0; i < this.size; i++) {
        arr[i] = this.elementDate[i];
      }

      // 3) 복제한 스택 객체가 새로 만든 배열을 가리키도록 한다.
      temp.elementDate = arr;

      return temp;
    } catch (CloneNotSupportedException ex) {
      System.out.println(ex);
      return null;

    }
  }

  public Iterator<E> iterator() {
    return new StackIterator<E>(this);
  }

}


