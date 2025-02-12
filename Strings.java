import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {

        String sentence = "My name is Jsmoke";
        String name = sentence.substring(11);

        System.out.println(name);

        //Strings are Immutable

        //compare
        // String name1 = "Jsmoke";
        // String name2 = "Jsmoke";

        // if(name1.compareTo(name2)  == 0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Jsmoke") == new String("Jsmoke")){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not equal");
        // }
 
        // //concatentation
        // String name = "Jsmoke";
        // String lastName = "xxx";
        // String fullName = name + "@" +lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Your name is : " + name );
        // // //String Declaration
        // String name = "Jsmoke";
        // String fullName =  "you know who it is";
        // String sentence = "Hey what's up";

    }
}
