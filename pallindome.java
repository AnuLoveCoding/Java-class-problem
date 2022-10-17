
import java.util.*;

public class pallindome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your number");

        long N = scn.nextLong() , sum =0 , temp =N;
       int n = 200;
      for(int i=1;i<=n;i++){
        for(;N>0;N/=10){
            long rem = N%10L;
            sum =(sum*10)+rem;
        }
      }
       
        
    //     for(int i =0;N>i;N/=10){
    //         int rem = N%10;
    //         sum = sum+rem*rem*rem;
    //     }
       System.out.println("**************");
       System.out.println(temp);
       System.out.println(sum);
       System.out.println("****************");

        if(temp==sum){
            System.out.println("Number is Plaindrome");
        }else{
            System.out.println("Number not Palindrome");
        }
    }
}
