package logicalthinkingandpatterns;
// package MphasisPracticeSet1.LogicalThinkingANDPattern; // Package declaration

import java.util.*;
import java.io.*;

public class PasswordStrengthValidator {

    /*
     * ✅ Password Strength Rules:
     * 1. Must be at least 8 characters long
     * 2. Must contain at least one uppercase letter
     * 3. Must contain at least one lowercase letter
     * 4. Must contain at least one digit
     * 5. Must contain at least one special character
     */

    public static void main(String[] args) throws IOException {
        // Create BufferedReader for taking user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the password: ");
        String password = br.readLine(); // Read password input from user

        // Boolean flags to track each password rule
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // ✅ Step 1: Check for minimum length
        if (password.length() < 8) {
            System.out.println("Invalid length! Password must be at least 8 characters long.");
            return; // Exit program early if condition fails
        }

        // ✅ Step 2: Check each character to identify uppercase, lowercase, digit, or special
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i); // Get current character

            if (Character.isUpperCase(ch)) {
                hasUpper = true; // Found uppercase letter
            } else if (Character.isLowerCase(ch)) {
                hasLower = true; // Found lowercase letter
            } else if (Character.isDigit(ch)) {
                hasDigit = true; // Found digit
            } else {
                hasSpecial = true; // Found special character (non-letter, non-digit)
            }
        }

        // ✅ Step 3: Validate all required conditions together
        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("✅ Strong Password!");
        } else {
            // If any condition is missing, print which ones are missing
            System.out.println("❌ Weak Password! Please include the following:");
            if (!hasUpper) System.out.println("- At least one uppercase letter");
            if (!hasLower) System.out.println("- At least one lowercase letter");
            if (!hasDigit) System.out.println("- At least one digit");
            if (!hasSpecial) System.out.println("- At least one special character");
        }
    }
}
