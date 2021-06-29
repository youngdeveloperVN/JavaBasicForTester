package com.vn.model;

import java.io.Serializable;

/**
 * The class for employee. alt + shift + s + R
 * Date: 2021-06-28
 * @author ngoch
 *
 */
public class Employee implements Serializable {
	// hằng số - final
	private static final long serialVersionUID = 1L;
	// class variable
	private static String COMPANY_NAME = "FSOFT";
	
	// instance variable 
	private String id;
	private int age;
	private String name;
	private String phone;

	public String getId() {
		// local variable - prefixCompany
		String prefixCompany = "F";
		return prefixCompany + id;
	}

	//String id - parameter
	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}