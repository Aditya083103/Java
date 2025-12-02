package logicalthinkingandpatterns;
import java.io.*;
import java.util.*;
public class frequency {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence:");
        String[] words = br.readLine().toLowerCase().split("\\s+");


        Map<String, Integer> map = new HashMap<>();
        for(String w:words) {
            map.put(w, map.getOrDefault(w,0)+1);
        }

        for(String w: map.keySet()){
            System.out.println(w+" "+map.get(w));
        }


    }
}
