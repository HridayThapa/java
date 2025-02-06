package com.wipro.java.collection;
import java.util.*;

public class AnimalAge implements Comparator<Animal>{

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        // Creating a list of Animal objects
        ArrayList<Animal> l = new ArrayList<>();
        l.add(new Animal(10,"Dog"));
        l.add(new Animal(5,"Cat"));
        l.add(new Animal(8,"Tiger"));
        
        // Creating a list of Age objects
        ArrayList<Age> l1 = new ArrayList<>();
        l1.add(new Age(10,"Dog"));
        l1.add(new Age(5,"Cat"));
        l1.add(new Age(8,"Tiger"));
        
        // Sorting the list of Age objects using Comparable
        Collections.sort(l1);
        System.out.println("Sort using Comparable: ");
        for(Age a : l1) {
            System.out.println(a.getName() + " " + a.getAge());
        }
        
        // Sorting the list of Animal objects using Comparator (AnimalAge)
        Collections.sort(l, new AnimalAge());
        System.out.println("Animals after sorting by age using Comparator: ");
        for(Animal a : l) {
            System.out.println(a.getName() + " " + a.getAge());
        }
    }

    // Comparing animals based on their age
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge());  // Compares ages of two Animal objects
    }
}
