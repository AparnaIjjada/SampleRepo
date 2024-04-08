package com.java.encapsulation;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("Noel");
		System.out.println("The student id is "+s.getId());
		System.out.println("The student name is "+s.getName());

	}

}
