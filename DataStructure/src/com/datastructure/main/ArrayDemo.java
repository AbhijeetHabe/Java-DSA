package com.datastructure.main;

import com.datastructure.entity.*;

public class ArrayDemo {

	public static void main(String[] args) {
		int size = 3;
		int[] arr = {10,20,30,0,0,0};
		ArrayImplementation obj = new  ArrayImplementation(arr, size);
		obj.insertElement(2, 1);
		obj.insertElement(112, 3);
		System.out.println("List of Element");
		obj.traverseArray();
		obj.deleteAtPositon(3);
		System.out.println("List of Element");
		obj.traverseArray();
		obj.searchElement(12);
		obj.updateAtPosition(2, 100);
		System.out.println("List of Element");
		obj.traverseArray();
	}

}
