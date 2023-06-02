package com.datastructure.main;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		int num = 19;
		int toPower = 3;
		int pow = power(num, toPower);
		
		System.out.println(num+" to the power "+toPower+" is "+pow);
	}
	
	public static int power(int num, int toPower) {
		if (toPower == 0) {
			return 1;
		}
		
		return power(num, toPower-1)*num;
	}

}
