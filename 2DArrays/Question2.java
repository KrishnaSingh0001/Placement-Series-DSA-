// Question 2 :- Write a java program to find the largest element of a given 2D arryas of integer 
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i = 0;
        // int j = 0;
        int [][] arr = new int [2][2];
        
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<m ;i++ ){
            for(int j = 0 ; j<n ; j++){

                mx = Math.max(mx , arr[i][j]);
                if(arr[i][j]==mx){
                    System.out.println("The largest element of the array is : " + mx);
                }
                
            }
        }
    }
    
}
