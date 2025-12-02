package Numberlogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decimaltobinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1 for Decimal→Binary or 2 for Binary→Decimal: ");
        int choice = Integer.parseInt(br.readLine());

        if(choice==1){
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            String bin= "";
            while(n>0){
                bin = (n%2)+ bin;
                n/=2;
            }
            System.out.println("binary"+bin);
        }else{
            System.out.println("enter binary");
            String bin= br.readLine();
            int dec=0;
             for (int i = 0; i < bin.length(); i++){
                dec = dec * 2 + (bin.charAt(i) - '0');

             }
             System.out.println("Decimal: " + dec);

        }
    }
}
