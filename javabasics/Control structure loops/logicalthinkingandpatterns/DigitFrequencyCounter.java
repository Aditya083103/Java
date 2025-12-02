package logicalthinkingandpatterns;

import java.util.*;
import java.io.*;

public class DigitFrequencyCounter {
    public static void main(String[] args) throws IOException {

        // Create BufferedReader for reading input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter a number (as string, to handle any length)
        System.out.println("Enter a number: ");
        String number = br.readLine();

        // Create an integer array to count the frequency of digits 0–9
        int[] freq = new int[10];  

        for(int i=0; i<number.length(); i++){
            char ch=number.charAt(i);

            if(Character.isDigit(ch)){
                int digit= ch = '0';
                freq[digit]++;
            }
        }
