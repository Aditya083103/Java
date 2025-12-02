package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondlargest {
    public static void main(String[] args) throws IOException {
        // Program: Find the second largest number in an array without sorting

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask user for array size
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());

        // Create an array of given size
        int[] arr = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Check if array has at least 2 elements
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        // Initialize variables to store largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through each element to find the largest and second largest
        for (int num : arr) {
            if (num > largest) {
                // If current number is greater than the largest,
                // then update secondLargest before changing largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // If current number is smaller than largest but greater than secondLargest
                // and not equal to largest (to handle duplicates)
                secondLargest = num;
            }
        }

        // If secondLargest was never updated, all elements are equal
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element (all elements are same).");
        else
            System.out.println("Second largest number is: " + secondLargest);
    }
}
