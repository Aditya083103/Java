package Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class rotatearray {
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter value of k to rotate the array");
        int k= Integer.parseInt(br.readLine());
        k=k%n;

        int[] rotated= new int[n];
        for(int i=0; i<n; i++){
            rotated[(i+k)%n]= arr[i];
        }

        System.out.println("Array after rotations:");

        for(int num:rotated){
            System.out.print(num+ " ");
        }

    } 
}
