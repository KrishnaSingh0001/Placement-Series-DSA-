//Write a code to reverse a number 
 
package Questions;
import java.util.*;
public class ReverseaNumber {
    public static void reversed(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int num = 1234; 
      
      int reversed = 0;
      System.out.println("Original Number: " + num);
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
    }
}
