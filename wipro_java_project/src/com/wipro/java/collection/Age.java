package com.wipro.java.collection;

public class Age implements Comparable<Age>{

	private int age;
	private String name;
	
	
	public Age(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	

	public int getAge() {
		return age;
	}



	public String getName() {
		return name;
	}



	@Override
	public int compareTo(Age a) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, a.age);
	}

}
