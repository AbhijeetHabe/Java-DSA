package com.searchingandsorting.main;

public class HeapSort {

	public static void main(String[] args) {

		int[] arr = {50,30,15,19,20,10,5,2};
		int n = arr.length;
		
		heapSort(arr, n);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void heapSort(int[] a, int n) {
		for (int i=n/2-1; i>=0; i--) {
			heapify(a,n,i);
		}
		for (int i=n-1; i>=0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,i,0);
		}
	}
	
	public static void heapify(int[] a, int n, int i) {
		int largest = i;
		int left = 2*i +1;
		int right = 2*i +2;
		
		if (left < n && a[left] > a[largest]) {
			largest = left;
		}
		if (right < n && a[right] > a[largest]) {
			largest = right;
		}
		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a,n,largest);
		}
	}

}
