package com.wipro.java.oops;
/**
 * Parent Class= Employee
 * Child class= ProjectLead
 * extends= keyword
 */

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
	//THe child object is instantiated from the child constructor
	//Parent class consumes the  properties and behaviors of child class
	Employee emp1=new ProjectLead();
	emp1.setId(1234);
	emp1.setName("Alex");
	emp1.setSalary(70000f);
	System.out.println("Employee ID: "+ emp1.getId());
	System.out.println("Employee Name: "+ emp1.getName());
	System.out.println("Employee Salary: "+ emp1.getSalary());
}
}
