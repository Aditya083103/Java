package logicalthinkingandpatterns;
import java.io.*;
import java.util.*;
public class sudoku {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 9 numbers (space-separated): ");
        String[] parts = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        for (String p : parts) {
            int n = Integer.parseInt(p);
            if (n < 1 || n > 9 || !set.add(n)) {
                System.out.println("Invalid Sudoku row");
                return;
            }
        }
        System.out.println("Valid Sudoku row");
    }
    
}
