package com.java.association;

class Multiply{
	public int mul(int a,int b) {
		return a*b;
	}
}

public class Cohesion {
	public static void main(String[] args) {
		Multiply m=new Multiply();
		System.out.println("The product is "+m.mul(3, 5));
	}

}
