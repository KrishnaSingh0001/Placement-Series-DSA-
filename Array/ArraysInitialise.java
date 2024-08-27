import java.util.*;
public class ArraysInitialise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :  ");
        int n = sc.nextInt();
        
        int arr[] = new int [n]; // Size of Array
        // int n = arr.length;  // length of Arrray (Length operator )
        // System.out.println(n);
        /// for input looop
        for (int i = 0 ; i<= n-1 ; i++){
            System.out.print("Enter the element of Array");
            arr[i] = sc.nextInt();
        }

        ///For output looop

        for(int i = 0 ; i<=n-1;i++){
            System.out.println(arr[i] + " ");
        }
        
    }
    
}