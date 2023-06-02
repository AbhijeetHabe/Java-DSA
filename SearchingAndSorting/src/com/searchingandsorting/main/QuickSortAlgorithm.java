package com.searchingandsorting.main;

public class QuickSortAlgorithm {

	public static void main(String[] args) { 
		// 10 , 8, 6 ,12,6,15,3 ,9 ,5 20
		int arr[] = {10,8,6,12,6,15,3,9,5,20};
		int l = 0;
		int h = 9;
		quickSort(arr,l,h);
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void quickSort(int[] arr, int l, int h) {
		if (l<h) {
			int p = partition(arr,l,h);
			quickSort(arr,l,p);
			quickSort(arr,p+1,h);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start-1;
		int j = end+1;
		
		while(true) {
			i++;
			while (arr[i] < pivot) {
				i++;
			}
			j--;
			while (arr[j] > pivot) {
				j--;
			}
			if (i>=j) {
				return j;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
