package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;
//	private String name;
//	private int age;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	public Student() {
		super();
		System.out.println("Student 클래스 생성");
	}
	public Student(String name, int age, String major) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.major = major;
		System.out.println("Student() 클래스 생성");
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " " + major;
	}
}