package com.array.main;

public class Largest {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,70,10,20};
		int lar = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>lar) {
				lar = arr[i];
			}
		}
		System.out.println("Largest number is "+lar);

	}

}
