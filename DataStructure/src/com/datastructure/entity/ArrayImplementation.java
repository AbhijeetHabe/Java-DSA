package com.datastructure.entity;

public class ArrayImplementation {
	private int[] arr;
	private int size;
	
	public ArrayImplementation(int[] arr,int size) {
		this.size = size;
		this.arr = arr; 
	}
	public void traverseArray() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void insertElement(int element, int position) {
		if(position > size || position < 1) {
			System.out.println("invalid position entered for element");
			return;
		}
		
		for(int i = size-1; i >= position-1;i--) {
			arr[i+1] = arr[i];
		}
		arr[position-1] = element;
		size++;
	}
	
	public void deleteAtPositon(int position) {
		if(size == 0) {
			System.out.println("array is empty , can not remove"
					+ " elements");
			return;
		}
		
		if(position < 1 || position >= size) {
			System.out.println("invalid position entered");
			return;
		}
		for(int i=position-1;i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}
	
	public void searchElement(int element) {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			if(arr[i] == element) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Found the element");
		} else {
			System.out.println("Element not found");
		}
	}
	
	public void updateAtPosition(int position, int element) {
		arr[position-1] = element;
	}
}
