package com.wipro.java.oops.inheritance;
/**
 * Parent Class= Employee
 * Child class= Manager
 * extends= keyword
 */

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}

public static void main(String a[]) {
	//THe child object is instantiated from the child constructor
	//Parent class consumes the  properties and behaviors of child class
	Employee emp1=new Manager();
	emp1.setId(2222);
	emp1.setName("Chris");
	emp1.setSalary(50000f);
	System.out.println("Employee ID: "+ emp1.getId());
	System.out.println("Employee Name: "+ emp1.getName());
	System.out.println("Employee Salary: "+ emp1.getSalary());
	}

}
