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
    // LinkedList에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return this.new ListIterator<E>();
  }


  // non-static nested class = inner class
  // 바깥 클래스와 구분하기 위해서 T로 변경
  class ListIterator<T> implements Iterator<T> {

    List<T> list;
    int cursor;

    @SuppressWarnings("unchecked")
    public ListIterator() {
      // 바깥 클래스의 정보를 받기 위해서 AbstractList를 붙여줬음
      this.list = (List<T>) AbstractList.this;
    }

    @Override
    public boolean hasNext() {
      return cursor < this.list.size();
    }

    @Override
    public T next() {
      return list.get(cursor++);
    }

  }


}
