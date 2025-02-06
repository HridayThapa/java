package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> l=new ArrayList<>();
		l.add(new Movie("Bahubali",8.8,2010));
		l.add(new Movie("Player One",8.2,2014)); 
		l.add(new Movie("Inception",8.5,2012));
		
		Collections.sort(l);
		
		System.out.println("Movies after sorting by rating: ");
		for(Movie m:l) {
			System.out.println(m.getN()+" "+m.getR()+" "+m.getY());
		}
	}
}
