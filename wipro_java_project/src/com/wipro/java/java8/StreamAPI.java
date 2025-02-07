package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamAPI {

	public StreamAPI() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Alex","Alan","Brock","Daimon","Ken");
		List<String> stream1 = list.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
		System.out.println(stream1);
		
		
		List<String> names = Arrays.asList("Alex","Alan","Brock","Daimon","Ken");
		List<String> stream2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream2);
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		
		int min = numbers.stream().min(Integer::compare).get();
		int max = numbers.stream().max(Integer::compare).get(); 
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		 System.out.println("Min value: "+min);
		 System.out.println("Max value: "+max);
		 System.out.println("Sorted Numbers: ");
		 for(int a:sortedNumbers) {
			 System.out.println(a);
		 }
			 
		 }
	}

