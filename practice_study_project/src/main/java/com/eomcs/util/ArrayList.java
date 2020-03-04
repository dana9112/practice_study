package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> extends AbstractList<E> {
  private static final int DEFAULT_CAPACITY = 2;

  Object[] elementDate; // 객체를 저장한다.

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

  @Override
  public void add(E e) {
    if (this.size == this.elementDate.length) {
      grow();
    }
    this.elementDate[this.size++] = e;
  }

  @Override
  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    return (E) this.elementDate[index];
  }

  @SuppressWarnings("unchecked")
  @Override
  public E set(int index, Object e) {
    if (index < 0 || index >= this.size) {
      return null; // 함수를 더이상 실행하지말고 나가라
    }
    E oldValue = (E) this.elementDate[index];
    this.elementDate[index] = e;
    return oldValue;
  }

  @Override
  public E remove(int index) {
    if (index < 0 || index >= this.size) {
      return null; // 함수를 더이상 실행하지말고 나가라
    }

    @SuppressWarnings("unchecked")
    E oldValue = (E) this.elementDate[index];
    System.arraycopy(this.elementDate, //
        index + 1, this.elementDate, index, this.size - (index + 1));
    /*
     * 위의 문장과 하기 문장이 같다. for (int i = index + 1; i < this.size; i++) { this.elementDate[i-1] =
     * this.elementDate[i]; }
     */
    this.size--;
    return oldValue;
  }


  @Override
  public Object[] toArray() {
    return Arrays.copyOf(this.elementDate, this.size);
  }

  @Override
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      // 파라미터로 받은 배열이 작을 때는 새 배열을 만들어 리턴.
      return (E[]) Arrays.copyOf(this.elementDate, this.size, arr.getClass());
    }
    System.arraycopy(this.elementDate, 0, arr, 0, this.size);
    return arr; // 넉넉할 때는 파라미터로 받은 배열을 그대로 리턴.
  }

  @Override
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


