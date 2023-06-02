package com.datastructure.main;

import com.datastructure.entity.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListImplementation ll = new LinkedListImplementation();
		
		ll.insertElement(10);
		ll.insertElement(20);
		ll.insertElement(30);
		ll.insertElement(40);
		ll.insertElement(50);
		
		System.out.println("Element in linked list");
		ll.traverseList();
		
		ll.searchElement(40);
		ll.searchElement(33);
		
		ll.deleteElement(40);
		System.out.println("Element in linked list");
		ll.traverseList();
		
	}

}
