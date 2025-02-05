package com.wipro.java.collection;
import java.util.*;

public class AllCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAY
		 int[] arr;

	        // allocating memory for 5 integers.
	        arr = new int[5]; // 0,1,2...4; index format

	        // initialize the first elements of the array
	        arr[0] = 1;
	        arr[1] = 2;
	        arr[2] = 3;
	        arr[3] = 4;
	        arr[4] = 5;
	        
	        // printing array elements
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Element at index " + i + ": " + arr[i]);
	        }
	        
	        
	        
	        
	        //LIST
	        List<Integer> l1=new ArrayList<Integer>();//creating a list of integers
			//Assigning the values to the indexes
			l1.add(0,4);
			l1.add(1,2);
			l1.add(2,7);
			System.out.println("List 1: "+l1);
			List<Integer> l2=new ArrayList<Integer>();
			//Values are assigned in order
			l2.add(1);
			l2.add(3);
			l2.add(5);
			System.out.println("List 2: "+l2);
			l1.addAll(2,l2);//adds all the elements of list 2 in order at 1 position
			l1.remove(2);//removes the element present at index 2 
			l1.set(1, 15);//sets the value of the element at 0 index to 5
			System.out.println("Final List 1: "+l1);
			
			
			
			
			
			//LINKED LIST
			List<Integer> ll=new LinkedList<Integer>();//creating linked list
			int n=5;//number of elements
			for (int i = 1; i <= n; i++)
				ll.add(i+5);

			// Printing elements
			System.out.println("Linked List: "+ll);

			// Remove element at index 3
			ll.remove(4);// index

			// Displaying the list after deletion
			System.out.println("Linked List after deletion: "+ll);

			// Printing elements one by one
			System.out.println("Linked list elements: ");
			for (int i = 0; i < ll.size(); i++)
				System.out.print(ll.get(i) + " ");
			System.out.println();
			
			
			
			//MAP	
			Map<Integer,String> map= new HashMap<Integer, String>();//creating a Map
			//Assigning values to the keys
			//Keys should be of unique value
			map.put(1, "Dog");
			map.put(2, "Cat");
			map.put(3, "Tiger");
			System.out.println("Key 1 value: "+map.get(1));//Outputs the value of key 1: Dog
			System.out.println("Key 2 value: "+map.get(2));//Outputs the value of key 2: Cat
			//Checks if there is a key 3 in the map
			if(map.containsKey(3)) {
				System.out.println("Key 3 value: "+map.get(3));//Outputs key 3: Tiger
			}
			//Iterates for all the keys in the map and outputs every key
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
			}
			map.remove(3);//removes the key value pair of key 3
			
			System.out.println("After removal of key 3 ");
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
			}

	}

}
