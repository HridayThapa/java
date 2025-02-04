/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Sub2 extends TwoNums{

	/**
	 * 
	 */
	//Polymorphism
	@Override
	public int operation(int a,int b) {
		return a-b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNums obj=new Sub2();	
		obj.setA(10);
		obj.setB(5);
		int result = obj.operation(obj.getA(), obj.getB());
		System.out.println("Result: " + result);
		
	}

}
