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
    
    // annoymous class : 인스턴스를 한 개만 생성할 경우 로컬 클래스를 익명 클래스로 정의하라
    return new Iterator<E>() {

      // 단순히 값을 할당하느 경우에는 인스턴스 블록에 넣지 않고,
      // 필드 선언에 바로 할당 연산자를 사용할 수 있다.
      Queue<E> queue = (Queue<E>) Queue.this.clone();

      @Override
      public boolean hasNext() {
        return queue.size() > 0;
      }

      @Override
      public E next() {
        return queue.poll();
      }
    };

  }

}


