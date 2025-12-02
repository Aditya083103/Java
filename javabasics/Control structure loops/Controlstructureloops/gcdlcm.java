package Controlstructureloops;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class gcdlcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int num1 = a;
        int num2 = b;

        // Find GCD using subtraction method
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        int gcd = num1;
        int lcm = (a * b) / gcd; // use original numbers here

        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }
}
