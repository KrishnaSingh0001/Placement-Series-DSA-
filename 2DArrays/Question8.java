// Write a program to rotate the matrix by 90degree clock wise . 


public class Question8 {
    public static void print (int [][] arr) {
        int m = arr.length;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] arr  = {{1 , 2 , 3 },{4,5,6},{7 , 8, 9}};
        int m = arr.length;

        print(arr);
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j<=i; j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = m - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        print(arr);
    }
}
