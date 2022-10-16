import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // System.out.println("Enter Your First-Number");
        // int A = scn.nextInt();
        // System.out.println("Enter Your Second-Number");
        // int B = scn.nextInt();
        // int h1=0;
        // for(int i=1;i<=A || i<=B ;i++){
        //     if(A%i==0 && B%i==0){
        //         h1 = i;
        //     }
        // }
        // // System.out.println("Your HCF is: ");
        // System.out.println("Your HCF is: "+h1);

     //    find the sum of digit ;
        // int a = 78945;
        // int sum =0;
        // while(a>0){
        //     int d = a%10;
        //      sum+=d;
        //      a/=10;
        // }
        // System.out.println(sum);

        //  find the last of and print in reverse direction;

        // int a =85412;

        // while(a>0){
        //     int rem = a%10;
        //     System.out.print(rem+" ");
        //     a/=10;
        // }

        // find the last digit and first digit of number;

        int a = 4561327;
        int Last_digit = a%10;
        int first_digit =0;

            while(a>0){
                int rem = a%10;
                first_digit= rem;
                a/=10;
            }
            System.out.println("The first digit of number: "+first_digit);
            System.out.println("The Last_digit of number: "+Last_digit);





    }
}
