package com.datastructure.main;

import com.datastructure.entity.*;

public class CircularQueueDemo {

	public static void main(String[] args) {
		
		CircularQueue que = new CircularQueue(10);
		
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		
		System.out.println("Initially Queue is : ");
		que.display();
		
		que.dequeue();
		System.out.println("Initially Queue is : ");
		que.display();
		
		que.dequeue();
		System.out.println("Initially Queue is : ");
		que.display();
	}

}
