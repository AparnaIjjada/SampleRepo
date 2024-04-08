package com.java.polymorphism;

class Addition{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		System.out.println(Addition.add(2, 3));
		System.out.println(Addition.add(2, 3,1000));

	}

}
