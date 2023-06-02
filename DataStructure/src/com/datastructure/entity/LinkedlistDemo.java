package com.datastructure.entity;

import com.datastructure.entity.LinkedListPractice;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPractice ll = new LinkedListPractice();
		ll.insertElement(10);
		ll.insertElement(20);
		ll.insertElement(30);
		ll.insertElement(40);
		ll.insertElement(50);
		
		System.out.println("Display linked list");
		ll.traverse();
		
		ll.deleteElement(30);
		System.out.println("Display linked list");
		ll.traverse();
		
	}

}
