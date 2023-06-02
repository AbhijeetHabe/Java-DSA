package com.datastructure.entity;

public class LinkedListPractice {
	private Node head; 
		
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void traverse() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			System.out.print(head.data+"->");
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public void insertElement(int element) {
		Node n = new Node(element);
		
		if (head == null) {
			head = n;
			return;
		}
		if (head.next == null) {
			head.next = n;
			return;
		}
		Node temp = head;
		while(temp.next != null) {  // Is D.next != null  False 
			temp = temp.next;   // temp is D
		}
		// We know D.next is null so we have
		// to insert element in D.next
		temp.next = n; 
	}
	
	public void deleteElement(int element) {
		Node prev = null;
		Node temp = null;
		
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		if (head.next == null && head.data == element) {
			head = null;
			return;
		}
		temp = head;
		while(temp != null && temp.data != element) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp != null) {
			prev.next = temp.next;
		}
		
		if (temp == null) {
			System.out.println("Element not found");
		}
	}
		
}
