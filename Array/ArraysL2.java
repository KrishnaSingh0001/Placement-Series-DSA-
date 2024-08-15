// Syntax And Declaration 
import java.util.*;
public class ArraysL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int [] arr = new int [7];
         int x = sc.nextInt();
         for(int i = 0 ; i<= 3; i++){
            arr[i] = sc.nextInt();
         }
        //  arr[0] = 10;
        //  arr[1] = 20;
        //  arr[2] = 30;
        //  arr[3] = 40;

         for (int i = 0; i<=3;i++){
            System.out.print(arr[i] + " ");

         }


    }
    
}
