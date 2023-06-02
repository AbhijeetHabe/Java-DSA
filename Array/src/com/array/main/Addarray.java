package com.array.main;

public class Addarray {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {40,30,20,10};
		int[] arr3 = new int[4];
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i] = arr1[i]+arr2[i];
			System.out.print(arr3[i]+" ");
		}
	}

}
