package Numberlogic;
import java.io.*;

public class fibonacciseries {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int n = Integer.parseInt(br.readLine());

        int a=0, b=1;

        System.out.println("Fibonacci series:");

        for(int i=0; i<n; i++){
            System.out.println(a+ " ");
            int c=a+b;
            a=b;
            b=c;
        }



    }
    
}
