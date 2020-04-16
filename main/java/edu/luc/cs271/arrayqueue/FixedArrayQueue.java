package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size >= capacity)
    {
      return false;
    }
    rear = (rear + 1) % capacity;
    data[rear] = obj;
    size++;
    return true;
  }

  @Override
  public E peek() {
    if (size == 0)
    {
      return null;
    }
    return data[front];
  }

  @Override
  public E poll() {
    if(isEmpty())
    {
      return null;
    }
    final E result = data[front];
    front = (front + 1) % capacity;
    size--;
    return result;
  }

  @Override
  public boolean isEmpty()
  {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    final List<E> result = new ArrayList<>(size);

    for(int i = 0; i < size; i++)
    {
      result.add(data[(front + i) % capacity]);
    }
    return result;
  }
}
