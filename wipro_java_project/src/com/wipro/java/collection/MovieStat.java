package com.wipro.java.collection;
import java.util.*;

public class MovieStat implements Comparator<MovieStat>{

	@Override
	public int compare(MovieStat o1, MovieStat o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private String n;
	private double r;
	private int y;
	
	public MovieStat(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}

	public String getN() {
		return n;
	}

	public double getR() {
		return r;
	}

	public int getY() {
		return y;
	}

}
