package com.datastructure.main;

public class PermuteStringRecursion {

	public static void main(String[] args) {
		
		String s = "abhi";
		int start = 0;
		int end = 3;
		permuteString(s, start, end);
	}
	
	public static void permuteString(String s, int start, int end) {
		
		if(start == end) {
			System.out.println(s);
			return;
		} else {
			for (int i = start; i<=end; i++) {
				s = swap(s, start, i);
				permuteString(s,start+1,end);
				s=swap(s,start,i);
			}
		}
	}
	
	public static String swap(String s, int i, int j) {
		char[] ca = s.toCharArray();
		char temp = ca[i];
		ca[i] = ca[j];
		ca[j] = temp;
		return String.valueOf(ca);
	}
}
