/**
 * 
 */
package com.wipro.java.oops;

/**
 * Getters have a return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values or behaviors are determined through setters
 * toString will convert the entire animal class into properties and behaviors
 * POJO Plain Old Java Object
 */
public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", Salary=" + Salary + "]";
	}

	private int id;//This is employee ID
	private String name;//This is employee name
	private String position;//This is the position of the employee
	private int Salary;//This is the salary of the employee
	
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


	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}


	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
