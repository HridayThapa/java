/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {

	/**
	 * @param args
	 */
	public Animal(String name, String color,int age) {
		super();//calls the root parent class=object
		this.name = name;
		this.color = color;
		this.age=age;
	}
	private String name;
	private String color;
	private int age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
		else
			System.out.println("Age must be positive");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal("Tiger","Orange",15);
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
		
		a1.setAge(10);
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
		
		a1.setAge(-2);
		
	}

	
	
}
