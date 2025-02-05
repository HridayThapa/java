package com.wipro.java.collection;
import java.util.*;
public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map= new HashMap<Integer, String>();//creating a Map
		//Assigning values to the keys
		//Keys should be of unique value
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println("Key 1 value: "+map.get(1));//Outputs the value of key 1
		System.out.println("Key 2 value: "+map.get(2));//Outputs the value of key 2
		//Checks if there is a key 3 in the map
		if(map.containsKey(3)) {
			System.out.println("Key 3 value: "+map.get(3));//Outputs key 3 
		}
		//Iterates for all the keys in the map and outputs every key
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		map.remove(2);//removes the key value pair of key 2
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("After removal of key 2 ");
            System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
