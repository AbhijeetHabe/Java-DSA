package com.datastructure.main;

import com.datastructure.entity.*;

public class StackDemo {

	public static void main(String[] args) {
		
		StackImplementation obj = new StackImplementation(10);
		
		obj.push(5);
		System.out.println("Stack values");
		obj.display();
		obj.push(7);
		System.out.println("Stack values");
		obj.display();
		obj.pop();
		System.out.println("Stack values");
		obj.display();
		obj.push(3);
		System.out.println("Stack values");
		obj.display();
		obj.pop();
		obj.pop();
		System.out.println("Stack values");
		obj.display();
		obj.push(9);
		
		System.out.println("Stack values");
		obj.display();
		
	}
	

}
