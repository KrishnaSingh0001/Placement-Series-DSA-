// Linear Search Problems 
import java.util.*;
public class LinearSearchArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr target element :");
        int x = sc.nextInt();
        System.out.print("Enter array Size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter arrays elements : ");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // for(int i = 0 ; i<n; i++){
        //     if(arr[i]==x){
        //         System.out.println("Element to be found ");
        //     }
        //     else{
        //         System.out.println("element not found ");
        //     }
        // }
        boolean flag = false ; // element not to be found 
        for(int i=0 ; i<n ; i++){
            if(arr[i]==x){
                flag = true; //element found 
                break;
            }
        }
        if(flag==true){
            System.out.println("Element found ");
        }
        else{
            System.out.println("Element not to be found ");
        }

    }
    
}
