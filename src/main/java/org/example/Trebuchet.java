package org.example;
import org.apache.commons.lang3.StringUtils;

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
            line = replaceLettersWithNumbers(line);
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

// Replace letter number with number
    // Create a method to replace lettered with numbered
    // Create a method to add the numbers together
    private static String replaceLettersWithNumbers(String line) {
        String[] listOfNumbers = new String[] {"oneight", "twone", "eightwo", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] listOfNumbersAsNumbers = new String[] {"18", "21", "82", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


       return StringUtils.replaceEach(line, listOfNumbers, listOfNumbersAsNumbers);
    }
}