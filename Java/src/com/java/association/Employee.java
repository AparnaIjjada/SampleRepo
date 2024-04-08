package com.java.association;

public class Employee {
	int id;
	String name;
	Address address;
	
	

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.country+" "+address.state+" "+address.city);
	}



	public static void main(String[] args) {
		Address add1=new Address("India", "Delhi", "Gurgoan");
		Address add2=new Address("Korea", "Seoul", "Namsan");
		Address add3=new Address("China", "Shangai", "Wuhan");
		
		Employee emp=new Employee(1, "Aparna", add1);
		Employee emp2=new Employee(2, "Sindhu", add2);
		Employee emp3=new Employee(3, "Rakesh", add3);
		emp.display();
		emp2.display();
		emp3.display();

	}

}
