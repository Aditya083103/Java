package logicalthinkingandpatterns;

import java.util.*;
import java.io.*;

public class NumberPyramid {
    public static void main(String[] args) throws IOException {

        // Create BufferedReader for taking input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user for the size (number of rows in the pyramid)
        System.out.println("Enter the size of the Number Pyramid: ");
        int size = Integer.parseInt(br.readLine()); // Read input and convert to integer

        int num = 1; // Starting number to print in the pyramid

        // Outer loop → controls the number of rows
        for (int i = 1; i <= size; i++) {

            // Step 1️⃣: Print the current row number (for reference or design)
            System.out.print(i + " ");

            // Step 2️⃣: Print spaces → helps to align numbers in a pyramid shape
            for (int s = size; s > i; s--) {
                System.out.print(" "); // Print one space for each missing level
            }

            // Step 3️⃣: Print the numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
                num++; // Increment number for next print
            }

            // Step 4️⃣: Move to the next line after finishing one row
            System.out.println();
        }
    }
}
