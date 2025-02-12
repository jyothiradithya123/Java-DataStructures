// import java.util.Scanner;
public class Recursion {

//8.  place tiles
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if( n<m){
            return 1;
        }
        //vertically
        int vertPlacements= placeTiles(n-1, m);

        //horizontal
        int horPlacements = placeTiles(n-1,m);

        return vertPlacements + horPlacements;

    }
    public static void main(String[] args) {
        int n =4, m=2;
        System.out.println(placeTiles(n, m));
        
    }














   

//1. Print 5 nos using recursion
    // public static void printNumb(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }
    
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNumb(n);
       
    // }

//2.Sum of n numbers
// public static void printSum(int i,int n,int sum){
//     if(i == n){
//         sum +=i;
//         System.out.println(sum);
//         return;
//     }

//     sum += i;
//     printSum(i+1,n,sum);

// }
// public static void main(String[] args) {
//     printSum(0, 5, 0);
    
// }


//3.Factorial of a no. using recursion
// public static int calcfactorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     int fact_nm1 = calcfactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    //     // System.out.println(fact_n);

    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calcfactorial(n);
    //     System.out.println(ans);
        
    // }


//4. Fibonacci series using Recursion
// public static void printFib(int a,int b,int n){
//     if( n == 0){
//         return;
//     }
//     int c = a + b;
//     System.out.println(c);
//     printFib(b,c,n-1);
//     return;

// }
// public static void main(String[] args) {
//     int a =0 , b=1;
//     System.out.println(a);
//     System.out.println(b);
//     int n = 7;
//     printFib(a, b, n-2);

    
// }

//5.Caluclate power using recursion
    // public static int calcPower(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     int xPownm1 = calcPower(x, n-1);
    //     int xPown = x * xPownm1;
    //     return xPown;

    // }
    // public static void main(String[] args) {
    //     int x = 2 , n = 5;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
        
    // }

//6. print permuatations of abc
//Time complexity = O(n!)
    // public static void printPerm(String str,String permutation){
    //     if (str.length() == 0){
    //         System.out.println(permutation);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         char currChar = str.charAt(i);
    //         String newStr = str.substring(0,i) + str.substring(i+1);
    //         printPerm(newStr, permutation+currChar);

    //     }
        
    // }
    // public static void main(String args[]){
    //     String str = "abc";
    //     printPerm(str,"");


    // }

// //7.Total paths in n*m
//     public static int countPaths(int i,int j,int n,int m){
//         if(i == n|| j == m){
//             return 0;  
//         }
//         if(i == n-1 && j == m -1){
//             return 1;
//         }
//         int downPaths = countPaths(i+1, j, n, m);

//         int rightPaths = countPaths(i, j+1, n, m);

//         return downPaths + rightPaths;

//     }

//     public static void main(String[] args) {
//         int n=3, m=3;
//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println(totalPaths);
        
//     }












}
