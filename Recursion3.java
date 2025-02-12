import java.util.ArrayList;

public class Recursion3{
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
            
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n,subset);
        
    }












    // public static int callGuests(int n){
    //     if(n<=1){
    //         return 1;
    //     }

    //     //single
    //     int way1 = callGuests(n-1);

    //     //pair
    //     int way2 = (n-1) * callGuests(n-2);

    //     return way1 + way2;
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     System.out.println(callGuests(n));
        
    // }













    // public static int placeTiles(int n,int m){
    //     if(n == m){
    //         return 2;
    //     }  
    //     if(n<m){
    //         return 1; 
    //     }      
        
    //     //vertically
    //     int vertTiles = placeTiles(n-m, m);

    //     //horizontally
    //     int horzTiles = placeTiles(n-1, m);

    //     return vertTiles + horzTiles;

    // }
    // public static void main(String[] args) {
    //     int n =4, m =2;
    //     System.out.println(placeTiles(n, m));
    // }









    // public static int countPaths(int i, int j,int n, int m){
    // //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     //downpaths
    //     int downPaths = countPaths(i+1, j, n, m);
    //     //rightpaths
    //     int rightPaths = countPaths(i, j+1, n, m);

    //     return downPaths + rightPaths;
    // }
    // public static void main(String[] args) {
    //     int n =3,m=4;
    //     int totalPaths = countPaths(0,0,n,m);
    //     System.out.println(totalPaths);


        
    // }



















    // @SuppressWarnings("unused")
    // public static void printPerm(String str,String perm){
    //     if(str.length() == 0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char currChar = str.charAt(i);

    //         String newStr = str.substring(0,i) + str.substring(i+1);
    //         printPerm(newStr,perm+currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printPerm(str,"");
        
    // }
}