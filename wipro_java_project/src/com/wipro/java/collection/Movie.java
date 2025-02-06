package com.wipro.java.collection;

public class Movie implements Comparable<Movie>{
	private String n;
	private double r;
	private int y;
	

	public Movie(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	public int compareTo(Movie m) {
		return Double.compare(this.r,m.r);
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
