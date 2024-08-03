// Write a program to add a two matrices 
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        // arr[i][j]= sc.nextInt();
        int m = a.length;
        int n = b[0].length;
        int res [][] = new int[m][n];

        for(int i = 0 ; i<2; i++ ){
            for(int j = 0 ; j<2; j++ ){
                a[i][j]= sc.nextInt();
                b[i][j]=sc.nextInt();
                res[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i = 0 ; i<2; i++ ){
            for(int j = 0 ; j<2; j++ ){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


    }
}
