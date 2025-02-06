package com.wipro.java.collection;
import java.util.*;

public class AnimalAge implements Comparator<Animal>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> l=new ArrayList<>();
		l.add(new Animal(10,"Dog"));
		l.add(new Animal(5,"Cat"));
		l.add(new Animal(8,"Tiger"));
		
		ArrayList<Age> l1=new ArrayList<>();
		l1.add(new Age(10,"Dog"));
		l1.add(new Age(5,"Cat"));
		l1.add(new Age(8,"Tiger"));
		
		Collections.sort(l1);
		System.out.println("Sort using Comparable: ");
		for(Age a:l1) {
			System.out.println(a.getName()+" "+a.getAge());
	}
		Collections.sort(l,new AnimalAge());
		System.out.println("Animals after sorting by age using Comparator: ");
		for(Animal a:l) {
			System.out.println(a.getName()+" "+a.getAge());
	}
	}

	@Override
	public int compare(Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		return Integer.compare(a1.getAge(), a2.getAge());
	}

	

}
