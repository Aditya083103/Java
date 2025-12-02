package Numberlogic;
import java.io.*;
public class armstrongnumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int temp=num; 
        int sum=0;

        while(temp>0){
            int d =temp%10;
            sum+= d*d*d;
            temp/=10;
        }

        if(num==sum){
            System.out.println("Armtrong number");
        }else{
            System.out.println("not Armtrong number");
        }

        
    }
    
}
