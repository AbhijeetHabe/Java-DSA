package com.array.main;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Employee ID: ");
		int eid = sc.nextInt();
		System.out.println("Enter your Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("NAME = "+name);
		System.out.println("EMPLOYEE ID = "+eid);
		System.out.println("SALARY = "+salary);
	}

}
