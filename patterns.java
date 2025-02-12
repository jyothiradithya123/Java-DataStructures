// import java.util.*;
public class patterns{
    public static void main(String [] args){
        int n = 4;

        for(int i = n; i>=1; i--){
                for(int j =1; j <= i; j++){
                        System.out.print("*");
                }
                System.out.println(" ");

        }

//1      
        // int n = 4;
        // int m = 5;

        // //outer loop
        // for(int i =1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=m;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }
        // System.out.println();

//2  Hollow Rectangle
        // int n = 4;
        // int m = 5;
        
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=m;j++){
        //       //cell -> (i,j)
        //     if (i == 1 || j==1 |i ==n ||j == m){
        //         System.out.print("*");
        //     }else{
        //         System.out.print(" ");

        //     }
        // }
        // System.out.println();
        // }
        
//3  Pyramid
        // int n = 4;


        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     }
       
//4  Inverted pyramid
        // int n =4;

        // //outer loop
        // for(int i=n;i>=1;i--){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

//5    Inverted rotated pyaramid 
        // int n = 4;

        // //outer loop
        // for(int i=1;i<=n;i++){
        //         //inner loop -> space print
        //         for(int j=1;j<=n-i;j++){
        //                 System.out.print(" ");
        //         }
        //         //inner loop -> star print
        //         for(int j=1;j<=i;j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();

        // }

//6 Pyramid Nos.

        // int n = 5;

        // //outer loop
        // for (int i=1;i<=n;i++){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

//7 Inverted pyramid nos.
        // int n = 5;

        // //outer loop
        // for (int i=1;i<=n;i++){
        //         for(int j=1; j<=n-i+1; j++){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }

//8
        // int n = 5;
        // int number =1;


        // //outer loop
        // for (int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //                 System.out.print(number);
        //                 number++;

        //         }
        //         System.out.println();

        // }

//9

        // int n =5;

        // //outer loop
        // for(int i=1;i<=n;i++){
        //         //inner loop
        //         for(int j=1;j<=i;j++){
        //                 int sum = i+j;
        //                 if(sum %2 == 0){//even
        //                         System.out.print("1");
        //                 }else{//odd
        //                         System.out.print("0");
        //                 }
        //         }System.out.println();
        // }


//10  Butterfly Pattern

        // int n = 5;

        // //Upper Half
        // for(int i=1; i<=n ;i++){
        //         //1st part
        //         for(int j=1; j<=i ;j++){
        //                 System.out.print("*");            
        //         }       
        //         //spaces
        //         int spaces = 2 * (n-i);
        //         for(int j =1;j<=spaces;j++){
        //                 System.out.print(" ");
        //         }
        //         //2nd part
        //         for(int j=1; j<=i; j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();

        // }
        //Lower Half
        // for(int i=n; i<=1 ;i--){
        //         //1st part
        //         for(int j=1; j<=i ;j++){
        //                 System.out.print("*");
                
        //         }                    
        //         //spaces
        //         int spaces = 2 * (n-i);
        //         for(int j =1;j<=spaces;j++){
        //                 System.out.print(" ");
        //         }
        //         //2nd part
        //         for(int j=1; j<=i; j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();

        // }
    }
}