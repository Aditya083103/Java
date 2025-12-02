package strings;
import java.io.*;
public class countvowels {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter a string");
        String str = br.readLine().toLowerCase();

        int vowels=0, consonants=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if(ch>='a'  &&  ch<='z'){
                if(ch=='a'  ||  ch=='e'  ||  ch=='i'  ||  ch=='o'   ||  ch== 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.println("Total number of vowels in the string are "+vowels);
        System.out.println("Total number of consonants in string are:"+consonants);

        }

        
    }
    

