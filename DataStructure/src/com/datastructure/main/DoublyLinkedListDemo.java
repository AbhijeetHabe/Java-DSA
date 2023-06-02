package com.datastructure.main;

import com.datastructure.entity.*;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertElement(10);
		dll.insertElement(20);
		dll.insertElement(30);
		dll.insertElement(40);
		dll.insertElement(50);
		
		System.out.println("Elemets in doubly linked list");
		dll.traverseList();
		System.out.println();
		
		dll.deleteElement(20);
		System.out.println("Elemets in doubly linked list");
		dll.traverseList();
		
		dll.deleteElement(40);
		System.out.println("Elemets in doubly linked list");
		dll.traverseList();
		
		dll.searchElement(50);
		dll.searchElement(15);
	}

}
