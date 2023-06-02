package com.datastructure.main;

public class PalindromeRecursion {

	public static void main(String[] args) {
		
		String s = "akkai";
		System.out.println("Is "+s+" palindrome :"+isPalindrome(s));
		
		String s1 = "bbaakkaabb";
		System.out.println("Is "+s1+" palindrome :"+isPalindrome(s1));
	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}
		else if (s.charAt(0) != s.charAt(s.length() -1)){
			return false;
		} 
		else {
			return isPalindrome(s.substring(1,s.length()-1));
		}
	}
	
}
