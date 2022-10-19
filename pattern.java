/**
 * pattern
 */
import java.util.*;;
public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        // System.out.println("Enter Your Number: ");
        // int N = scn.nextInt();
        // String bag= "";
        // System.out.println("Star of Pattern Number:");

        // for(int i=1;i<=N;i++){
            
        //     bag+="*\t";

        //     System.out.println(bag);
        // }
       

        //  print the  stair pattern printing

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


       
        //    Star printing Concepts// Using nested Loop;
        // for(int i=1;i<=15;i++){
        //     for(int j=1;j<=6;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // for(int i = 1;i<=5;i++){
        //     for(int j=5;j>=i;j--){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

            // reverse stair case star printing;
            // for(int i=5;i>0;i--){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*\t");
            //     }
            // System.out.println();
            // }



            // print the even_number with star Printing;
            // for(int i=1;i<=10;i++){
            //     for(int j=1;j<=i;j++){
            //         if(j%2==0){
            //             System.out.print(" "+j);
            //         }else{
            //             System.out.print(" *");
            //         }
            //     }
            //     System.out.println();
            // }

                // reverse left stair case star printing;
                // for(int i=1;i<=5;i++){
                //     for(int j=1;j<=5-i;j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }


                // for(int i=1;i<=5;i++){
                //     System.out.println("*");

                //     for(int j=1;j<=)
                // }

                // reverse right stair case star printing;
                    int n = 6;
                    int nspaces = n-1;
                    int nstars =1;

                    for(int i=1;i<=n;i++){
                        for(int j=1;j<=nspaces;j++){
                            System.out.print("\t");
                        }
                        for(int j=1;j<=nstars;j++){
                            System.out.print("*\t");
                        }
                        nspaces--;
                        nstars++;
                        System.out.println();
                    }


                // int n =5;
                // int nspaces = n - 1;
                // int nstars = 1;
        
                // for (int i = 1; i <= n; i++) {
                //     for (int j = 1; j <= nspaces; j++) {
                //         System.out.print("\t");
                //     }
        
                //     for (int j = 1; j <= nstars; j++) {
                //         System.out.print("*\t");
                //     }
        
                //     nspaces--;
                //     nstars++;
                //     System.out.println();
                // }




    }
}