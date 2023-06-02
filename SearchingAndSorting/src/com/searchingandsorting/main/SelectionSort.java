package com.searchingandsorting.main;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {26,54,93,17,77,31,44,55,20};   
		selectionSort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int smallest = i;
			
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
	}

}
