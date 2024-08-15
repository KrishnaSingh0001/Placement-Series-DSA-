// Question : - Calculate the sum of all the elements in the given arrays. (sum of san array )
// arr [] = {81, 17 , 45, 36 , 31 , 100, 60 }; 
import java.util.*;
public class Question2Arrays {
    public static void main(String[] args) {
        
       int arr [] = {81, 17 , 45, 36 , 31 , 100, 60 };
        int sum = 0 ;
        int n = arr.length;
        for (int i = 0 ; i< n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
}
