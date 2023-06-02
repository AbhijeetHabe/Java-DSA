package com.searchingandsorting.main;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {4,7,2,5,6,9,1,3,8};
		bubbleSort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}
	
	public static void bubbleSort(int[] arr) {
		boolean swapped = false;
		
		for (int i=1; i<=arr.length-1; i++) {
			for (int j=0; j<=arr.length-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				return;
			}
		}
	}

}
