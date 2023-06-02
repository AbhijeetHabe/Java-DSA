package com.searchingandsorting.main;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,22,34,43,55,122,764,1001};
		int low = 0;
		int high = arr.length -1;
		int element = 35;
		int index = searchSortedArray(arr,low,high,element);
		System.out.println("Index of element "+element+" is "+index);
		
		int element1 = 764;
		int index1 = searchSortedArray(arr,low,high,element1);
		System.out.println("Index of element "+element1+" is "+index1);
	}
	
	public static int searchSortedArray(int[] arr,int low, int high, int element) {
		if (low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		if (element == arr[mid]) {
			return mid;
		}
		else if (element > arr[mid]) {
			return searchSortedArray(arr,(mid+1),high,element);
		}
		else {
			return searchSortedArray(arr,low,(mid-1),element);
		}
	}
}

