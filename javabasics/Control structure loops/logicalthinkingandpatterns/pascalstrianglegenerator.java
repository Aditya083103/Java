package logicalthinkingandpatterns;
import java.io.*;
public class pascalstrianglegenerator { public static void main(String[] args) throws IOException {
        // Create BufferedReader to take user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user for the number of rows
        System.out.print("Enter number of rows: ");
        int n = Integer.parseInt(br.readLine());

        // Outer loop → for each row of Pascal's Triangle
        for (int i = 0; i < n; i++) {
            int num = 1; // First number in each row is always 1

            // Inner loop → print numbers in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " "); // Print the current number

                // Compute the next number in the row using the formula:
                // next = current * (rowIndex - columnIndex) / (columnIndex + 1)
                num = num * (i - j) / (j + 1);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
