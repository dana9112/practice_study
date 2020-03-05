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
    // inner class를 생성하려면 바깥 클래스의 인스턴스 주소를 앞쪽에 줘야 한다.
    return this.new StackIterator<E>(this);
  }


  // non-static nested class = inner class
  class StackIterator<T> implements Iterator<T> {

    Stack<T> stack;
    int cursor;

    @SuppressWarnings("unchecked")
    public StackIterator(Stack<T> stack) {
      this.stack = (Stack<T>) Stack.this.clone();
    }

    @Override
    public boolean hasNext() {
      return !stack.empty();
    }

    @Override
    public T next() {
      return stack.pop();
    }


  }


}


