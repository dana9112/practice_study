package com.eomcs.util;

public abstract class AbstractList<E> implements List<E> {

  protected int size;

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<E> iterator() {
    // LinkedList에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return new ListIterator<E>(this);
  }

}
