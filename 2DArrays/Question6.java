// Write a program to change the given matrix with its transpose 

public class Question6 {
    public static void main(String[] args) {
        int [][] arr = {{1 , 2} , {3 , 4 }, {5 ,6 }};
        int n = arr.length , m = arr[0].length;

        for(int j = 0 ; j<m ; j++){
            for(int i = 0 ; i<n ; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
