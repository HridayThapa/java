package com.wipro.java.java8;

//1. Only 1 abstract method
//2. @Functional Interface keyword
//3. Any number of default or/and static methods


@FunctionalInterface
interface TestInterface{
	public void shape(int a);//abstract method
	
	//Default Methods
	default String show(int a) {
		return "1";
	}
	default String show1(int a) {
		return String.valueOf(a);
	}
	// Static methods
    static String staticMethod1() {
        return "Static Method 1";
    }

    static String staticMethod2() {
        return "Static Method 2";
    }
}
public class Functionalinterface implements TestInterface {
	public void shape(int a) {
		System.out.println(a*a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionalinterface a=new Functionalinterface();
		a.shape(5);
		System.out.println(a.show(5));
	    System.out.println(a.show1(5));

	    // Using static methods from the interface
	    System.out.println(TestInterface.staticMethod1());
	    System.out.println(TestInterface.staticMethod2());
	}

}
