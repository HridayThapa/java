/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Bmw extends Car {
	
	/**
	 * @param args
	 */
	@Override
	public void display() {
        System.out.println("This is a BMW:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Bmw();
		c1.setMileage(10);
		c1.setModel("M4");
		c1.setTopSpeed(250f);
		c1.setColor("White");
		c1.display();
		
		
		System.out.println("Mileage "+ c1.getMileage());
		System.out.println("Model "+ c1.getModel());
		System.out.println("TopSpeed "+ c1.getTopSpeed());
		System.out.println("Color "+ c1.getColor());

	}


}
