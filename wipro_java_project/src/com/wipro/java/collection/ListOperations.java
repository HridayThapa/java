/**
 * 
 */
package com.wipro.java.collection;
import java.util.*;
/**
 * 
 */
public class ListOperations {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();//creating a list of integers
		//Assigning the values to the indexes
		l1.add(0,1);
		l1.add(1,5);
		l1.add(2,10);
		System.out.println("List 1: "+l1);
		List<Integer> l2=new ArrayList<Integer>();
		//Values are assigned in order
		l2.add(2);
		l2.add(4);
		l2.add(8);
		System.out.println("List 2: "+l2);
		l1.addAll(1,l2);//adds all the elements of list 2 in order at 1 position
		System.out.println("List 1 after addAll: "+l1);
		l1.remove(1);//removes the element present at index 1 
		l1.set(0, 5);//sets the value of the element at 0 index to 5
		System.out.println("Final List 1: "+l1);
	}

}
