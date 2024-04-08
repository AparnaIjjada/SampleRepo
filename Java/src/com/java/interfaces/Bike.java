package com.java.interfaces;

public class Bike extends SampleAC{

	@Override
	void speed() {
		System.out.println("The speed is 150 km/h");
		
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.milege();
		b.speed();
	}

}
