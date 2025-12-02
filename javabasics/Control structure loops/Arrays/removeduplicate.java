package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

//take integer array input and remove duplicates elements:

public class removeduplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter number of elements:");
        int n= Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        System.out.println("ENter"+n+"elements");
        for(int i=0; i<n; i++){
            arr[i]=  Integer.parseInt(br.readLine());
        }

        Set<Integer> set =  new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }

        System.out.println(set);
    }
    
}
