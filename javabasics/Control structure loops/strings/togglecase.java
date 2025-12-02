package strings;
import java.io.*;
public class togglecase {
      public static void main(String[] args) throws IOException {

        // 🔹 Create BufferedReader object to read input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 🔹 Prompt user for input
        System.out.println("Enter the String: ");
        String str = br.readLine();   // read the full line entered by user

        // 🔹 Initialize an empty string to store the toggled version
        String toggled = "";

        // 🔹 Traverse each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // get each character one by one

            // 🔸 If the character is uppercase, convert it to lowercase
            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch);
            } 
            // 🔸 If the character is lowercase, convert it to uppercase
            else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch);
            } 
            // 🔸 If the character is not a letter (like space, number, or symbol), keep it as is
            else {
                toggled += ch;
            }
        }

        // 🔹 Print the final toggled string
        System.out.println("The result string is: " + toggled);
    }
}

