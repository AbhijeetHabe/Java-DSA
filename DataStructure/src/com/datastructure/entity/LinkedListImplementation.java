package com.datastructure.entity;

public class LinkedListImplementation {
	private Node head;
	
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void traverseList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		
		if (head.next == null) {
			System.out.println(head.data+ "->");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void insertElement(int element) {
		Node n = new Node(element);
		
		if (head == null) {
			head = n;
			return;
		}
		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}
	
	public void deleteElement(int element) {
		Node temp = null;
		Node prev = null;
		
		if (head == null) {
			System.out.println("List is empty, cannot delete element");
			return;
		}
		
		if (head.data == element) {
			head = head.next;
		}
		
		temp = head;
		while (temp != null && temp.data != element) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp != null) {
			prev.next = temp.next;
			temp.next = null;
			return;
		}
		
		if (temp == null) {
			System.out.println("Element not found");
		}
		
	}
	
	public void searchElement(int element) {
		Node temp = null;
		
		if (head == null) {
			System.out.println("List is empty, cannot find element");
		}
		
		temp = head;
		while (temp != null && temp.data != element) {
			temp = temp.next;
		}

		if (temp != null) {
			System.out.println("Element found");
		}
		
		if (temp == null) {
			System.out.println("Element not found");
		}
		
	}
	
	
}
