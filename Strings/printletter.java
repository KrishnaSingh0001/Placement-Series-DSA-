package Strings;
public class printletter {
    public static void printletters(String str){
        for(int i = 0 ; i < str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstName = "Krishna";
        String SecondName = "Singh";
        String fullName = firstName + " "+ SecondName;
        // System.out.println( fullName + " is this " );
        // System.out.println(fullName.length());
        printletters(fullName);
    }
}
