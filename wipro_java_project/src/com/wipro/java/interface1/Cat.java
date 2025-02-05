package com.wipro.java.interface1;

public class Cat implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Cat();
		a1.sound();
	}
}
