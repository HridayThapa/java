package com.wipro.java.java8;

public class StringAPI {

	public StringAPI() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Name abc";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(1,5));
		System.out.println(str.contains("a"));
		String[] a= str.split(" ");
		for(String str1:a) {
			System.out.println(str1);
		}
	}

}
