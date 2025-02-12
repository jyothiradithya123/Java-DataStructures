import java.util.Scanner;
public class Conditions {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
                case 1:
                        System.out.println("Hello");
                        break;
        
                default:
                         System.out.println("Invalid");
                        break;
        }

// 1
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age > 18){
//             System.out.println("Adult");
//         }else{
//             System.out.println("Not adult");
//         }

          
//2
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // if(x % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

//3
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("Equal");
        // }else{
        //     if(a>b){
        //         System.out.println("a is greater");
        //     }else{
        //         System.out.println("B is greater");
        //     }
        
//4
        // if(3 % 2 == 0){                        //curlly braces not rrequired if its single line after if
        //     System.out.println("Bazinga");
        // }

//5
        // Scanner sc =  new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button ==1){
        //     System.out.println("Hello");
        // }else{
        //     if(button == 2){
        //         System.out.println("Namaste");
        //     }
        //     else{
        //         if(button == 3){
        //             System.out.println("Bonjour");
        //         }
        //         else{
        //             System.out.println("Invalid");
        //         }
        //     }
        // }
            

//6

//         Scanner sc =  new Scanner(System.in);
//         int button = sc.nextInt();

//         switch (button) {
//             case 1: System.out.println("Hello");
//             break;
//             case 2: System.out.println("Namaste");
//             break;
//             case 3: System.out.println("Bonjour");
//             break;
//             default:System.out.println("Invalid");;
//         }
        
//     }
    
    }
}
