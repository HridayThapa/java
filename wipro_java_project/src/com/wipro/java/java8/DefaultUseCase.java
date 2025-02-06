package com.wipro.java.java8;

interface TestInterface3{
	//Default method
	default void show() {
		System.out.println("Test Interface 3");
	}}
interface TestInterface4{
	//Default method
	default void show() {
		System.out.println("Test Interface 4");
	}
}

class DefaultUseCase implements TestInterface3, TestInterface4{
	public void show() {
		//using super keyword to call the show methods of respective interfaces
		TestInterface3.super.show();
		TestInterface4.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultUseCase d=new DefaultUseCase();
		d.show();
	}

}
