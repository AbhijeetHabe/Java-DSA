package com.searchingandsorting.main;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {4,7,2,5,6,9,1,3,8};
		InsertSort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void InsertSort(int[] arr) {
		for (int i=1; i<=arr.length-1; i++) {
			int element = arr[i];
			int j = i-1;
			
			while (j>=0 && element < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
	}

}
