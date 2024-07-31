// Output Using Nested loop 
import java.util.*;
public class Traversalsthrough2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [2][3];
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("The length of row is : "+ m);
        System.out.println("The length of column is : "+ n);
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i<2 ; i++ ){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
