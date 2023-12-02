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
           int sum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Split the line into an array of strings
            String intString = line.replaceAll("[^0-9]", "");
            char[] charArray = intString.toCharArray();

            String wholeNumElement = "" + charArray[0] + charArray[charArray.length - 1];
            System.out.println(wholeNumElement);

            sum += Integer.parseInt(wholeNumElement);

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