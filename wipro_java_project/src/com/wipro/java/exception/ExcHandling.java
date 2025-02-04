package com.wipro.java.exception;

public class ExcHandling {

 public static void main(String[] args) {
       
      try {
           int num1 =50/0;// This will throw ArithmeticException
        } 
      catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
      
       finally{
        	System.out.println("Executed");
        }
        System.out.println("Execution continues...");
    }
}
