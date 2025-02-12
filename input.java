import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextint,next,nexLine
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(name);
        System.out.println(sum);
    }
    
}
