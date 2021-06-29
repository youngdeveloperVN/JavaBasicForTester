package com.vn.introduction;

import com.vn.model.Employee;

public class CheckClass {
	
	public static void main(String[] args) {
		
		Object obj = new Employee();
		if(obj instanceof Employee) {
			System.out.println("obj is employee");
		} else {
			System.out.println("obj is not employee");
		}
		
	}
}
