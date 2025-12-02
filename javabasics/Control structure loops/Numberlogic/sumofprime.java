package Numberlogic;

import java.io.*;
public class sumofprime {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter start");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter end");
        int end= Integer.parseInt(br.readLine());

        int sum=0;

        for(int i=start; i<=end; i++){
            if(isPrime(i)) sum+=i;
        }
        System.out.println("Sum of primes:"+sum);


        
    }

    static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        

    }
    
}
