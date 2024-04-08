package com.java.inheritance;
class Dog{
	public void dog() {
		System.out.println("I am a dog!");
	}
}
class Beagle extends Dog{
	public void beagle() {
		System.out.println("I am a beagle!");
	}
}
class Pug extends Beagle{
	public void pug() {
		System.out.println("I am a pug!");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Pug pg=new Pug();
		pg.dog();
		pg.beagle();
		pg.pug();

	}

}
