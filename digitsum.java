import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = 863697;
        // int sum_Odd = 0;
        // int sum_Even = 0;
    //  System.out.println("hellow");
        int sum = 0;
        // int rem = 0;

            for(int i=1;i<=N;N/=10){
               int  rem = N % 10;
                sum+=rem;
               
            }
            System.out.println("The sum is : "+sum);
           

    }
}
