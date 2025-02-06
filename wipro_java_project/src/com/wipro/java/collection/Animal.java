package com.wipro.java.collection;

import java.util.Comparator;

public class Animal implements Comparable<Animal>,Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Animal a) {
		// TODO Auto-generated method stub
		System.out.println("Sort using Comparable: ");
		return this.name.compareTo(a.name);
	}

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public Animal(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
}
