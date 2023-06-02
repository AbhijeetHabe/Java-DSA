package com.datastructure.entity;

import com.datastructure.entity.StackImp;

public class StackImpDemo {

	public static void main(String[] args) {
		String str = "((())";
		
		if (isParenthesisCorrect(str)) {
			System.out.println("Parenthesis is correct");
		} else {
			System.out.println("Parenthesis is not correct");
		}
		
	}
	
	public static boolean isParenthesisCorrect(String str) {
		StackImp chr = new StackImp(10);
		int count = 0;
		
		for (int i=0;i<str.length();i++) {
			char element;
			if (str.charAt(i) == '(') {
				element = str.charAt(i);
				chr.push(element);
				count++;
			}
			if (str.charAt(i) == ')') {
				chr.pop();
				count--;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

}
