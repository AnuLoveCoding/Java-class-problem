import java.util.Scanner;

/**
 * whileproblem
 */
import java.util.*;
public class whileproblem {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);


        System.out.println("Enter Your Number");
        long n = scn.nextLong();

        if(n==0){
            System.out.println(0);
        }
        else if(n<0){
            n=-n;
        }
        while(n>0){
            Long rem = n%10L;
            System.out.print(rem+" ");
            
            n/=10;
        }
    }
}