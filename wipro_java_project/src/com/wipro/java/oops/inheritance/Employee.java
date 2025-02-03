/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Getters have a return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values or behaviors are determined through setters
 * toString will convert the entire animal class into properties and behaviors
 * POJO Plain Old Java Object
 */
public class Employee {
	
	private int id;//This is employee ID
	private String name;//This is employee name
	private float Salary;//This is the salary of the employee
	
	//Getter for ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}


}
