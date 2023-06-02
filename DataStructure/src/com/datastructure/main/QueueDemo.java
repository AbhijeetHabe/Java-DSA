package com.datastructure.main;

import com.datastructure.entity.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		QueueImplementation obj = new QueueImplementation(10);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(10);
		obj.enqueue(20);
		System.out.println("Initial values");
		obj.display();
		obj.dequeue();
		obj.dequeue();
		System.out.println("Values After Dequeue");
		obj.display();
	}

}
