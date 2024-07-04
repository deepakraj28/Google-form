package com.model;

public class Student {
	
	String regno,name,gender,dept,address;
	int age;
	public Student(String regno, String name, String gender, String dept, String address, int age) {
		super();
		this.regno = regno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.address = address;
		this.age = age;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
