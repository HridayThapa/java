package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {
    public static void readFile() throws FileNotFoundException { // Checked Exception (FileNotFoundException)
        File file = new File("nonexistent.txt"); // File does not exist
        Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
        
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); // Calling method that throws exception
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        System.out.println("Execution continues...");
    }
}
