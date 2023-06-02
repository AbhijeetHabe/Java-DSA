package com.datastructure.entity;

public class QueueImplementation {
	private int arr[];
	private int capacity;
	private int rear;
	
	public QueueImplementation(int size) {
		capacity = size;
		arr = new int[capacity];
		rear = 0;
	}
	
	public boolean isQueueEmpty() {
		if (rear == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isQueueFull() {
		if (rear == capacity) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(int element) {
		if (isQueueFull()) {
			System.out.println("Queue is full, cannot enqueue");
			return;
		}
		
		arr[rear] = element;
		rear++;
	}
	
	public Integer dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty, cannot dequeue");
			return null;
		}
		int element = arr[0];
		for (int i=0;i<rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return element;
	}
	
	public void display() {
		for(int i=0;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
}
