package Numberlogic;
import java.io.*;
public class perfectnumbers {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n= Integer.parseInt(br.readLine());
        System.out.println("Perfect numbers upto"+n+"are:");
        for(int i=1; i<=n; i++){
            int sum=0;
            for(int j=1; j<=i/2; j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i+" ");
            }
        }
        
    }
    
}
