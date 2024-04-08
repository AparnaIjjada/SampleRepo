package com.java.polymorphism;

class Vehicle {
	public void run() {
		System.out.println("vehicle is running");
	}
}

public class Car extends Vehicle{
	public void run() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		Vehicle c=new Car();
		c.run();
		

	}

}
