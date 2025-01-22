package BinearySearch;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10 , 23 , 46 , 89 , 91 , 97 , 107 , 140 , 264};
        int n = arr.length;
        int target = 46;
        int lo = 0;
        int  hi = n-1;
        boolean flag = false ; // means not present 
        while (lo<=hi){  // its just condition only for finding the element 
            int mid = (lo + hi )/2;
            if(arr[mid] == target){  // (its first condition)
                flag = true;
                break;
            }
            else if( arr[mid]> target){   //(its Second condition )
                hi = mid -1;
            }
            else {                        // (third condition we didnot write because else cov er all parts of the remainng conditions )
                lo = mid + 1;

            }
        }
        if(flag ==true){        // (flag we only use for making ture false statement )
            System.out.print("Target Found ");
        }
        else{
            System.out.println("Target Not Found");  
        }

    }
}