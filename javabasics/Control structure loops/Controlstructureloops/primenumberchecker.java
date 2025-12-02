import java.util.Scanner;
public class primenumberchecker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number which you want to check");
       int n= sc.nextInt();
       boolean isPrime= true;

       if(n<=1){
        isPrime=false;
       }
       else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    isPrime= false;
                    break;
                }
                
            }
       }
       if(isPrime){
        System.out.println("The number is prime");
       }
       else{
        System.out.println("The number is not prime number");
        System.out.println("Factors");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
       
       sc.close();
    }

    }
    
}
