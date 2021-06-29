package com.vn.introduction;

public class OperatorJava {
	
	public static void main(String[] args) {
		//a++ post-increment
		//++a pre-increment   a++  
		int a = 1;
		int b = a++;
//		int b = a;
//		a = a + 1
		
		int a1 = 1;
		int b1 = ++a1;
//		a1 = a1 + 1;
//		int b1 = a1;
		
		System.out.println("b: "+ b);
		System.out.println("b1: "+ b1);
		
	}
}
