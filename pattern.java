/**
 * pattern
 */
import java.util.*;;
public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter Your Number: ");
        int N = scn.nextInt();
        String bag= "";
        System.out.println("Star of Pattern Number:");

        for(int i=1;i<=N;i++){
            
            bag+="*\t";

            System.out.println(bag);
        }
       

        //  print the pattern 

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


    }
}