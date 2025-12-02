package Arrays;
import java.io.*;
public class sortedarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array elements(space-generated):");
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];

        for(int i=0; i<parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        boolean asc=true, desc=true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]< arr[i-1]) asc = false;
            if(arr[i]> arr[i-1]) desc = false;
            
        }

        if(asc){
            System.out.println("Array is sorted in ascneding order:");
        }
        else if(desc){
            System.out.println("Array is sorted in descending order");

        }else{
            System.out.println("Array is not sorted");
        }

        
    }
    
}
