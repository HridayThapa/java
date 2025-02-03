package com.wipro.java.oops;
/**
 * Parent Class= Employee
 * Child class= Developer
 * extends= keyword
 */

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
	//THe child object is instantiated from the child constructor
	//Parent class consumes the  properties and behaviors of child class
	Employee emp1=new Developer();
	emp1.setId(4321);
	emp1.setName("Adam");
	emp1.setSalary(30000f);
	System.out.println("Employee ID: "+ emp1.getId());
	System.out.println("Employee Name: "+ emp1.getName());
	System.out.println("Employee Salary: "+ emp1.getSalary());
}
}

