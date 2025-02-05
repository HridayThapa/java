package com.wipro.java.exception;

public class Unchecked {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; // Array with 3 elements

        try {
            System.out.println("Accessing index 5: " + numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }

        System.out.println("Execution continues...");
    }
}
