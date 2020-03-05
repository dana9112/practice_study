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
    // local class: 특정 메서드 안에서만 사용하는 중첩 클래스라면 그 메서드 안에 둔다.
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
    // 로컬 클래스는 인스턴스 멤버가 아니다.
    // 따라서 로컬 클래스의 생성자를 호출할 때 앞쪽에 this을 지정해서는 안된다.
    return new QueueIterator<>(this);
  }



}


