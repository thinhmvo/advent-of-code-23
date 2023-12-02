package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trebuchet {
    public static void main(String[] args) {


    // Try to open the file using Scanner
    try {
        File file = new File("D:\\workspace\\mike\\AdventOfCode\\src\\main\\resources\\trebuchet.txt");
        Scanner scanner = new Scanner(file);
        // Initialize 2 pointer that point to each end of the array
        int sum = 0;
        // Read the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Split the line into an array of strings
            String[] lineArray = line.split("");
            // Loop through the array of string
           // If the first pointer and the second pointer is a digit, combine them to form a number
            // If neither the first pointer nor the second pointer is a digit, move both pointers to the next element
            // Find an element that is a digit and concatenate it with itself to form a number



            for (int i = 0; i < lineArray.length; i++) {

}
            System.out.println(line);
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
        e.printStackTrace();
    }

}

// Replace letter number with
}