import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr1[] = new int[size];
        for(int i=0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        Boolean isAscending = true;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i] > arr1 [i+1]){
                isAscending = false;
            }
        }  
        if(isAscending){
            System.out.println("The array is sorted in ascending order");

        }else{
            System.out.println("The array is sorted in descending order");
        } 


        // int numbers [] = new int[size];
        // for(int i=0;i<numbers.length;i++){
        //     numbers[i] = sc.nextInt();

        // }
        // for(int i=0;i<numbers.length;i++){
        //     System.out.println(numbers[i]);
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]>max){
        //         max = numbers[i];
        //     }else{
        //         if(numbers[i]<min){
        //             min = numbers[i];
        //         }
        //     }
        // }
        // System.out.println("The largest no. is : " + max);
        // System.out.println("The smallest no. is : " + min);
    






        

        // int [] arr = new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i] = sc.nextInt();
           
        // }
        
        // for(int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        // }
        // int x = sc.nextInt();
        // for(int i=0;i<size;i++){
        //     if(arr[i] == x){
        //         System.out.println("The index found is : " + i);
        //     }
        // }
















    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int numbers [] = new int [size];

    //     //Input
    //     for(int i=0;i<size;i++){
    //         numbers[i] = sc.nextInt();
    //     }
    //     // int [] marks = new int[3];
    //     // marks[0] = 97;
    //     // marks[1] = 98;
    //     // marks[2] = 95;
    //     // int marks[] = {97,98,95};
    //     //Output5
    
    //     for(int i =0;i<size;i++){
    //         System.out.println(numbers[i]);
    //     }
    //     // System.out.println(marks[0]);
    //     // System.out.println(marks[1]);
    //     // System.out.println(marks[2]);
    }
}    
