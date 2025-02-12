import java.util.*;
public class Stringss{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");

        for(int i=0;i<sb.length()/2;i++){

       
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);


        // StringBuilder sb = new StringBuilder("H");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");

        // sb.append("0");

        // sb.append("!");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // StringBuilder sb = new StringBuilder("Jsmoke");
        
        // System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0,'J');
        // System.out.println(sb);

        // sb.insert(0,'x');
        // sb.insert(1,'x');
        // System.out.println(sb);

        // //delete
        // sb.delete(0,2);
        // System.out.println(sb);

        
    }
    

}
    

