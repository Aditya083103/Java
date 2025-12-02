package Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class missingnumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n (the range 1 to n): ");
        int n= Integer.parseInt(br.readLine());

        int[] arr = new int[n-1];
        System.out.println("Enter"  + (n-1) + "numbers: ");

        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int expectedSum = n*(n+1)/2;

        int actualSum =0;
        for(int num: arr){
            actualSum+=num;
        }
        int missingnumber=expectedSum-actualSum;

        System.out.println("The missing number is"+missingnumber);
        
    }
}
