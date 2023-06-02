package com.datastructure.entity;

public class CircularQueue {
	private int arr[];
	private int capacity;
	private int front;
	private int rear;
	
	public CircularQueue(int size) {
		capacity = size;
		arr = new int[capacity];
		rear = -1;
		front = -1;
	}
	
	public boolean isEmpty() {
		if (rear == -1 && front == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if ((rear+1)%capacity == front) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full cannot enqueue element");
			return;
		}
		if (isEmpty()) {
			front++;
			rear++;
		}
		else {
			rear = (rear+1)%capacity;
		}
		arr[rear] = element;
	}
	
	public Integer dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty cannot dequeue element");
			return null;
		}
		int element = arr[front];
		
		if(front == rear) {
			front = rear = -1;
			return element;
		}
		front = (front+1)%capacity;
		return element;
	}
	
	public void display() {
		int i;
		if(isEmpty()) {
			System.out.println("queue is empty , can not display");
			return;
		}
		
		for(i = front ; i != rear ; i = (i + 1) % capacity) {
			System.out.print(arr[i] + " ");
		}
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

}
