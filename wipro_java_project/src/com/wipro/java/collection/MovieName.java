package com.wipro.java.collection;
import java.util.*;

public class MovieName implements Comparator<MovieStat> {


	@Override
	public int compare(MovieStat m1, MovieStat m2) {
		// TODO Auto-generated method stub
		return m1.getN().compareTo(m2.getN());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieStat> l=new ArrayList<>();
		l.add(new MovieStat("Bahubali",8.8,2010));
		l.add(new MovieStat("Player One",8.2,2014)); 
		l.add(new MovieStat("Inception",8.5,2012));
		
		Collections.sort(l,new MovieName());
		
		System.out.println("Movies after sorting by name: ");
		for(MovieStat m:l) {
			System.out.println(m.getN()+" "+m.getR()+" "+m.getY());
	}

	}
}
