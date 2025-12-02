package strings;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.util.set;


public class pangramcheck {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a sentence");
        String sentence= br.readLine().toLowerCase();

        Set<Character> letters = new HashSet<>();


        for(char ch: sentence.toCharArray()){
            if(ch>='a' && ch<='z'){
                letters.add(ch);
            }
        }

        if(letters.size()=26){
            System.out.println("the sentence is pangram");
        }else{
            System.out.println("the sentence is not pangram");
        }

        // boolean[] alphabet = new boolean[26];

        // for(int i=0; i<sentence.length(); i++){
        //     char ch= sentence.charAt(i);

        //     if(ch>='a'  && ch<='z'){
        //         alphabet[ch - 'a'] = true;
        //     }
        // }

        // boolean ispangram=true;
        // for(boolean present : alphabet){
        //     if(!present){
        //         ispangram=false;
        //         break;
        //     }
        // }

        // if (ispangram)
        //     System.out.println("The sentence is a pangram.");
        // else
        //     System.out.println("The sentence is NOT a pangram.");


        
    }
}
