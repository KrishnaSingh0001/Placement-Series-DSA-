// import java.util.*;
// public class ArraysInitialise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Array Size :  ");
//         int n = sc.nextInt();  // for takin  input as a user  
        
//         int arr[] = new int [n]; // Size of Array
//         // int n = arr.length;  // length of Arrray (Length operator )
//         // System.out.p7\]\]rintln(n);
//         /// for input looop
//         for (int i = 0 ; i<= n-1 ; i++){
//             System.out.print("Enter the element of Array");
//             arr[i] = sc.nextInt();
//         }

//         ///For output looop

//         for(int i = 0 ; i<=n-1;i++){
//             System.out.println(arr[i] + " ");
//         }
        
//     }
    
// }

import java.util.*;

public class ArraysInitialise {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new  int [n];

        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the element of the Array ");
            arr[i] = sc.nextInt();

        }
        for(int i = 0 ; i<=n-1; i++){
            System.out.println(arr[i] + " ");
        }


    }
}