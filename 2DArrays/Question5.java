// Write a program to print the transpose of the matrix entered by the user and store it in a new matrix 

public class Question5 {
    public static void main(String[] args) {
        // 1 2
        // 3 4 
        // 5 6 
        int [][] arr = {{1 , 2 }, {3,4},{5,6}};
        int  m = arr.length; // this describe the row length
        int n =  arr[0].length;  // this describe the column length 
        for(int j = 0 ; j<n ; j++){  // this is the first outer loop for column 
            for(int i = 0 ; i<m ; i++){  // this is the second outer loop for row 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // Storing 

        int [][] transpose = new int [n][m];
        for( int  i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
