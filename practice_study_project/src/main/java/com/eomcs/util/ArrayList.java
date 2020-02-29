package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {
  // 배열을 사용하여 목록을 정리하겠다. 객체타입을 E라고 하자
  private static final int DEFAULT_CAPACITY = 2;
  // 상수 변수는 인스턴스마다 따로따로 만들기 귀찮으니
  // 클래스로 만들어 주고 내부에서만 쓸 것이니 private를 쓴다.

  Object[] elementDate; // 객체를 저장한다.
  int size;

  public ArrayList() {
    this.elementDate = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      this.elementDate = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementDate = new Object[initialCapacity];
    }

  }

  public void add(E e) {
    if (this.size == this.elementDate.length) {
      grow();
    }
    this.elementDate[this.size++] = e;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    return (E) this.elementDate[index];
  }

  public E set(int index, Object e) {
    if (index < 0 || index >= this.size) {
      return null; // 함수를 더이상 실행하지말고 나가라
    }
    @SuppressWarnings("unchecked")
    E oldValue = (E) this.elementDate[index];
    this.elementDate[index] = e;
    return oldValue;
  }

  public E remove(int index) {
    if (index < 0 || index >= this.size) {
      return null; // 함수를 더이상 실행하지말고 나가라
    }

    @SuppressWarnings("unchecked")
    E oldValue = (E) this.elementDate[index];
    System.arraycopy(this.elementDate, index + 1, this.elementDate, index, this.size - (index + 1));
    /*
     * 위의 문장과 하기 문장이 같다. for (int i = index + 1; i < this.size; i++) { this.elementDate[i-1] =
     * this.elementDate[i]; }
     */
    this.size--;
    return oldValue;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    return Arrays.copyOf(this.elementDate, this.size);
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      // 파라미터로 받은 배열이 작을 때는 새 배열을 만들어 리턴.
      return (E[]) Arrays.copyOf(this.elementDate, this.size, arr.getClass());
    }
    System.arraycopy(this.elementDate, 0, arr, 0, this.size);
    return arr; // 넉넉할 때는 파라미터로 받은 배열을 그대로 리턴.
  }

  public void add(int index, E value) {
    if (this.size == this.elementDate.length) {
      grow();
    }

    for (int i = size - 1; i >= index; i--)
      this.elementDate[i + 1] = this.elementDate[i];

    this.elementDate[index] = value;
    this.size++;
  }

  private Object[] grow() {
    return this.elementDate = Arrays.copyOf(this.elementDate, newCapacity());
  }

  private int newCapacity() {
    int oldSize = this.elementDate.length;
    return oldSize + (oldSize >> 1);
  }
}



// -------------------------------------------------------------------------------------------

/*
 * public ArrayList() { // 아래의 문장과 동일 = Object[] elementDate = new Object[100]; // arrylist에서 값을 초기화
 * 시키는 과정을 아래로 축약함. // 클래스를 초기화시키는 문장이 있을 경우 변수를 초기화 시키는 문장을 생성자로 옮긴다.(컴파일러가 하기와 같이 변환함) super();
 * this.elementDate = new Object[100]; this.size = 0; } // 목적에 따라 배열의 크기를 만들기 위해서 생성자를 별도로 만들어줌
 * public ArrayList(int initialCapacity) { super(); this.elementDate = new Object[initialCapacity];
 * }
 */
