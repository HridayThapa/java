/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car{
	//private behavior
	private int mileage;
	private String model;
	private float topSpeed;
	private String color;
	
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the topSpeed
	 */
	public float getTopSpeed() {
		return topSpeed;
	}

	/**
	 * @param topSpeed the topSpeed to set
	 */
	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public void display() {
		System.out.println("Car details: ");
	}
	@Override
	public String toString() {
		return "Car [mileage=" + mileage + ", model=" + model + ", topSpeed=" + topSpeed + ", color=" + color + "]";
	}

}
