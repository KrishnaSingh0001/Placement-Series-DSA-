// Write a Program to print the matrix in wave form.

public class Question9 {
    public static void main(String args []){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;

        // wave print 
        for(int i = 0 ; i<m ; i++){
            if(i%2==0){
                for(int j = 0 ; j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j = n-1; j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
