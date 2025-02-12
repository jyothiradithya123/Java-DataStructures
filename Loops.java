import java.util.Scanner;
public class Loops {
    public static void main(String [] args){

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10;i++){
                System.out.println(n + " x "+ i + " = "+n*i);
        }

       
    

//For Loop
        // for (int i = 0;i < 11; i++){ //Counter++ ---> Counter = Counter + 1,i-- = i - 1
        //    System.out.println(i+""); //i her is pointer or counter which points and updates
        // }


//While Loop
        // int i = 0;
        // while (i < 11){
        //     System.out.println(i);
        //     i++;                    //i++ = i + 1
        // }

//Do While

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 11);


//Sum of n natural nos. using for loop
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();


        // int sum =0;
        // for (int i =0; i<n;i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

// //Multiplication table using for loop\
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i<11;i++){
//             System.out.println(i*n);
//         }

//         // Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number : " + sc.nextInt());
        
        
//         int i = 0;
//         while(i <= 10){
//         System.out.println(2*i);
//         i++;
//         }

    }
    
}
