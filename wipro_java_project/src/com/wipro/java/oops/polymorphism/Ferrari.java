/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Ferrari extends Car {

	/**
	 * @param args
	 */
	@Override
	public void display() {
        System.out.println("This is a Ferrari:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Ferrari();
		c1.setMileage(8);
		c1.setModel("SF90");
		c1.setTopSpeed(340f);
		c1.setColor("Black");
		c1.display();
		
		System.out.println("Mileage "+ c1.getMileage());
		System.out.println("Model "+ c1.getModel());
		System.out.println("TopSpeed "+ c1.getTopSpeed());
		System.out.println("Color "+ c1.getColor());
		
	}

	

}
