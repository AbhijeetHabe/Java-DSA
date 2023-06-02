package com.datastructure.main;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		int num1 = 29;
		int num2 = 100;
		
		int gcd = gcd(num1,num2);
		System.out.println("Greatest common divisor for "+
		num1+" and "+num2+" is: "+gcd);
		
		int num3 = 40;
		int num4 = 100;
		
		int gcd2 = gcd(num3,num4);
		System.out.println("Greatest common divisor for "+
		num3+" and "+num4+" is: "+gcd2);
	}

	public static int gcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		else if (num1 == 0) {
			return num2;
		}
		else {
			return gcd(num2, num1%num2);
		}
	}
}
