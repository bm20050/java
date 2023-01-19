package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
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
	public Professor() {
		super();
		System.out.println("Professor 클래스 생성");
	}
	public Professor(String name, int age, String subject) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.subject = subject;
		System.out.println("Professor() 클래스 생성");
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " " + subject;
	}
}