package com.eomcs.util;

public class Queue<E> extends LinkedList<E> implements Cloneable {

  public void offer(E value) {
    this.add(value);
  }

  public E poll() {
    return this.remove(0);
  }

  @Override
  public Queue<E> clone() {

    Queue<E> temp = new Queue<E>();

    for (int i = 0; i < this.size(); i++) {
      temp.offer(get(i));
    }
    return temp;
  }

  @Override
  public Iterator<E> iterator() {
    return new QueueIterator<>(this);
  }


  class QueueIterator<T> implements Iterator<T> {

    Queue<T> queue;

    @SuppressWarnings("unchecked")
    public QueueIterator(Queue<T> queue) {
      // 바깥 클래스의 this (주소)를 사용하고 싶을 때
      // "클래스명.this"를 사용해야 함
      this.queue = (Queue<T>) Queue.this.clone();
    }


    @Override
    public boolean hasNext() {
      return queue.size() > 0;
    }

    @Override
    public T next() {
      return queue.poll();
    }

  }


}


