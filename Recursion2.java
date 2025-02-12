// import java.util.Scanner;

// import java.util.HashSet;

class Recursion2{
    // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};


    // public static void printComb(int idx,String str,String comnination){
    //     if (idx == str.length()){
    //         System.out.println(comnination);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     String mapping = keypad[currChar-'0'];

    //     for(int i=0; i<mapping.length(); i++){
    //         printComb(idx+1,str,comnination+mapping.charAt(i));
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "23";
    //     printComb(0, str,"");
        
    // }





















    // public static void subsquence(int idx,String str,String newString,HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         }else {
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char currChar = str.charAt(idx);

    //     //to be
    //     subsquence(idx+1, str, newString+currChar,set);

    //     //to not be
    //     subsquence(idx+1, str, newString,set);
    // }
    // public static void main(String[] args) {
    //     String str = "aaa";
    //     HashSet <String> set = new HashSet<>();
    //     subsquence(0, str, "",set);
        
    // }































    // public static void subsquence(int idx,String str,String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);

    //     //to be
    //     subsquence(idx+1, str, newString+currChar);

    //     //to not be
    //     subsquence(idx+1, str, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     subsquence(0, str, "");
        
    // }





















    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str,int idx,String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true){
    //         removeDuplicates(str,idx+1,newString);
    //     }else{
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str,idx+1,newString);
    //     }

    // }
    // public static void main(String[] args) {
    //     String str = "abbcddddeef";
    //     removeDuplicates(str, 0, "");
        
    // }

























    // public static void moveAllX(String str,int idx,int count,String newString){
    //     if(idx == str.length()){
    //         for(int i=0; i<count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //             return;
           
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x'){
    //         count ++;
    //         moveAllX(str, idx+1, count, newString);
    //     }else{
    //         newString += currChar;
    //         moveAllX(str, idx+1, count, newString);
    //     }


    // }
    // public static void main(String args[]){
    //     String str = "abcdxxxx";
    //     moveAllX(str, 0,0,"");

    // }
   





































    // public static int first = -1;
    // public static int last = -1;
    
    // public static void firstOccurence(String str,int idx,char element){
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (currChar ==element) {
    //         if(first == -1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }  
    //     firstOccurence(str, idx+1, element);  
    // }
    // public static void main(String[] args) {
    //     String str = "abaacdarfaah";
    //     firstOccurence(str, 0, 'a');
    // }

    // public static boolean isSorted(int arr[],int idx){
    //     if(idx == arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx] < arr[idx+1]){
    //         return isSorted(arr, idx+1);
    //     }else{
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,4,5,5};
    //     System.out.println(isSorted(arr, 0));
        
    // }

















    // public static void revString(String str,int idx){
    //     if(idx==0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     revString(str,idx -1);

    // }
    // public static void main(String[] args) {
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("Enter the string : ");
    //     // String str = sc.next();
    //     // int n = str.length();
    //     // revString(n,str);
    //     String str = "abcd";
    //     revString(str, str.length()-1);

        
    // }
    
    // public static void  towerOfHanoi(int n,String src,String helper,String dest){
    //     if(n == 1){
    //         System.out.println();
    //         return;
    //     }
    //     towerOfHanoi(n-1,src,dest,helper);
    //     System.out.println("transfer the disk" + n + "from" + src + "to" + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     towerOfHanoi(n,"S", "H", "D");
        
    // }
}
