package com.java.inheritance;

class Base{
	int parentnum=10;
}
class Child1 extends Base{
	int child1=2;
}
class Child2 extends Base{
	int child2=3;
}
public class Hierarical {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		System.out.println("parent * child1  = "+c1.parentnum * c1.child1);
		System.out.println("parent * child2  = "+c2.parentnum * c2.child2);

	}

}
