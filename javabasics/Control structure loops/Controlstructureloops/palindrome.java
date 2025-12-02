import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int original = n;
        
        int temp= Math.abs(n);
        long reversed=0;

        while(temp>0){
            reversed = reversed *10 + (temp%10);
            temp/=10;

        }

        if (n<0){
            System.out.println("Reversed:"+reversed);
        }
        else{
            System.out.println("Reversed:"+reversed);
        }


        if(n>=0  && reversed==n){
            System.out.println(original+"is a palindrome");
        }
        else{
            System.out.println(original+"is not a palindrome");
        }
    }
    
}
