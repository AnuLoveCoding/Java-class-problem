import java.util.Scanner;



import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        System.out.println("Enter Your Number");
        int N = scn.nextInt();

      for(int j=1;j<=N;j++){

        int n = j;
        int factor = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                factor++;
            }
        }
        if(factor==2){
            System.out.println(factor+":Number is prime");
        }else{
            System.out.println(factor +":Number is not prime");
        }
      }
        
    }
}
