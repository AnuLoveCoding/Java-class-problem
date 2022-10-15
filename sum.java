import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter Your Number");
        int n = scn.nextInt();
        int sum_odd=0 , sum_even=0 , count1=0 , count=0;
        
        // print the sum of n;
        // int sum =0;

        // int i=1;
        // for(;i<=n;n/=10){
        //     int rem = n%10;
        //     sum+=rem;
        // }
        // System.out.println(sum);


            // find the odd-digit and sum or find the even-digit and sum;

            for( int i = 0;n>i;n/=10){
                int digit = n%10;
                if(digit%2==0){
                    sum_even += n%10;
                    count++;
                }else if(digit%2!=0){
                    sum_odd += n%10;
                    count1++;
                }
            }
            System.out.println("The sum of odd is "+sum_odd);
            
            System.out.println("The count1 of odd is "+count1);
            System.out.println("+++++++++++++++++++");
            System.out.println("The sum of even is "+sum_even);
            System.out.println("The count of even is "+count);



    }
}
