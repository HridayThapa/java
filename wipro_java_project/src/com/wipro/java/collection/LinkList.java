package com.wipro.java.collection;

import java.util.*;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> ll=new LinkedList<Integer>();//creating linked list
	int n=5;//number of elements
	for (int i = 1; i <= n; i++)
		ll.add(i);

	// Printing elements
	System.out.println(ll);

	// Remove element at index 3
	ll.remove(3);// index

	// Displaying the list after deletion
	System.out.println(ll);

	// Printing elements one by one
	for (int i = 0; i < ll.size(); i++)
		System.out.print(ll.get(i) + " ");
	}

}
