import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 894894898;
        // print the sum of n;
        int sum =0;

        int i=1;
        for(;i<=n;n/=10){
            int rem = n%10;
            sum+=rem;
        }
        System.out.println(sum);






    }
}
