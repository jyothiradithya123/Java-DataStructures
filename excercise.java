import java.util.Scanner;
public class excercise {
    public static int printAverage(int a,int b,int c){
        int average = (a + b + c)/3;
        return average;        
    }
    public static int oddNumberSum(int n){
        int s = 0;
        for (int i=1;i<=n;i++){
            if(i % 2 != 0){
                s = i + s;
                
            }
        System.out.println(s);
        return s;
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int average = printAverage(a, b, c);
        System.out.println("The average of 3 nos. is " + average );
        oddNumberSum(n);


    }
    
}
