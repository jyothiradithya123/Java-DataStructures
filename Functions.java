import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Functions {    
    public static void printMyName(String name){      //Funtion
        System.out.println(name);
        return ;
    }
    
    public static int caluclateSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static int caluclateProduct(int a,int b){
        return a * b;
    }

    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){          //Loop
            factorial = factorial * i;        
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int sum = caluclateSum(a,b);


        
        System.out.println("Sum of 2 numbers is "+sum);
        System.out.println("Product of 2 numbers is "+caluclateProduct(a,b));

       printMyName(name);               //Function call

       printFactorial(n);
    }   

    
}
