 
// package Strings;
import java.util.*;
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s1 = "Krishna";
        // String s2 = "Singh";
        //For String s1
        System.out.print("Enter a string  s1: ");  
        String s1= sc.nextLine(); 
        //For string s2
        System.out.println("Enter a String s2:" );
        String s2 = sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("String are not Equal ");
        }
    }
}
