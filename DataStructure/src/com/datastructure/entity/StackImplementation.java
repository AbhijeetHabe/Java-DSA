package com.datastructure.entity;

public class StackImplementation {
	private int top;
	private int capacity;
	private int arr[];
	
	public StackImplementation(int size) {
		capacity = size;
		arr = new int[capacity];
		top = 0;
	}
	
	public boolean isStackEmpty() {
		if(top == 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isStackFull() {
		if(top == capacity) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int element) {
		if(isStackFull()) {
			System.out.println("Stack is full, cannot push a element");
			return;
		}
		for (int i=0;i<top;i++) {
			arr[i+1] = arr[i];
		}
		arr[0] = element;
		top++;
	}
	
	public Integer pop() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty, cannot pop a element");
			return null;
		}
		int element = arr[top];
		top--;
		return element;
	}
	
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
