/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Nissan extends Car {
	
	/**
	 * @param args
	 */
	
	//Defining the abstract method
	@Override
	public void types() {
		// TODO Auto-generated method stub
		System.out.println("This is a Nissan Sports Car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Nissan();
		c1.setMileage(10);
		c1.setModel("GTR");
		c1.setTopSpeed(300f);
		c1.setColor("Blue");
		c1.display();
		c1.types();//calling the abstract method
		
		System.out.println("Mileage "+ c1.getMileage());
		System.out.println("Model "+ c1.getModel());
		System.out.println("TopSpeed "+ c1.getTopSpeed());
		System.out.println("Color "+ c1.getColor());

	}


}
