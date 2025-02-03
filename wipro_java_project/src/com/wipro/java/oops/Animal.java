/**
 * 
 */
package com.wipro.java.oops;

/** No constructor
 * Getters have a return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values or behaviors are determined through setters
 * toString will convert the entire animal class into properties and behaviors
 * POJO Plain Old Java Object
 */
public class Animal {
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", population=" + population + ", weight=" + weight + "]";
	}


	//Private properties:
	private String name;//Name of the animal
	private String color;//Color of the animal
	private int population;//Population of the animal in thousands
	private float weight;//Weight of the animal
	
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	//Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter for color
	public String getColor() {
		return color;
	}

	//Setter for color
	public void setColor(String color) {
		this.color = color;
	}

	//Getter for population
	public int getPopulation() {
		return population;
	}

	//Setter for population
	public void setPopulation(int population) {
		this.population = population;
	}
	
	//Getter for weight
	public float getWeight() {
		return weight;
	}
	
	//Setter for weight
	public void setWeight(float weight) {
		this.weight = weight;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
