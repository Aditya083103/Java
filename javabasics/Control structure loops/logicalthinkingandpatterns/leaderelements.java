package logicalthinkingandpatterns;
import java.io.*;
public class leaderelements {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements(space-separated):");
        String[] parts = br.readLine().split(" ");
        int[] arr= new int[parts.length];

        for(int i=0; i<parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        int max = arr[arr.length -1];
        System.out.println("leaders:" +max+ " ");

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]> max){
                max= arr[i];
                System.out.println(max+ " ");
            }
        }

    }
    
}
