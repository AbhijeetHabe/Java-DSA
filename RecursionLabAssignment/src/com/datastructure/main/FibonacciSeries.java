package com.datastructure.main;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 10;
		
		int fibNum = fib(num);
		System.out.println("Fibonacci number of "+num+" is "+fibNum);
	}
	
	public static int fib(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		return fib(num-1) + fib(num-2);
	}
}
