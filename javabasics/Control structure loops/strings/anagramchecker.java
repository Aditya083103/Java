package strings;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class anagramchecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first string");
        String str1=  br.readLine().replaceAll("\\s", "").toLowerCase();

        
        System.out.println("Enter second string");
        String str2=  br.readLine().replaceAll("\\s", "").toLowerCase();

        if(str1.length()!= str2.length()){
            System.out.println("Not anagrams");
            return;
        }

        char[] arr1= str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");}
        else {
            System.out.println("Not anagrams");
        }
        }


        
        
    }
    

