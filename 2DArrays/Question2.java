// Question 2 :- Write a java program to find the largest element of a given 2D arryas of integer 

public class Question2 {
    public static void main(String[] args) {
        int [][] arr = new int [2][2];
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0 ; i<m ;i++ ){
            for(int j = 0 ; j<n ; j++){
                mx = Math.max(mx , arr[i][j]);
            }
        }
    }
    
}
