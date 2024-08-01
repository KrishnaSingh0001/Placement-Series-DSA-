// Write a program to store roll number and marks obtained by 4 Students sides by side in a matrix.
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][2];
        for(int i = 0 ; i<4; i++ ){
            for(int j = 0 ; j<2 ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i = 0 ; i<4; i++ ){
            for(int j = 0 ; j<2 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
 