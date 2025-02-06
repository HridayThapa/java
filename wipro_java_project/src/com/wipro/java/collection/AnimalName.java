package com.wipro.java.collection;
import java.util.*;

public class AnimalName implements Comparator<Animal>{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sort using Comparable: ");
		ArrayList<Animal> l=new ArrayList<>();
		l.add(new Animal(10,"Dog"));
		l.add(new Animal(5,"Cat"));
		l.add(new Animal(8,"Tiger"));
		
		
		Collections.sort(l);
		
		for(Animal a:l) {
			System.out.println(a.getName()+" "+a.getAge());
	}
		Collections.sort(l,new AnimalName());
		System.out.println("Animals after sorting by name using Comparator: ");
		for(Animal a:l) {
			System.out.println(a.getName()+" "+a.getAge());
	}
	}

	@Override
	public int compare(Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		return a1.getName().compareTo(a2.getName());
	}

}
