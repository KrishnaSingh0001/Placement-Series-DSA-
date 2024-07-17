import java.util.*;

public class Question1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the element you wants to store :  ");
        // int n = sc.nextInt();
        int arr[] = {81 , 45 , 67 , 100 , 12 , 34, 56 , 24 };
        // int [] arr = new int[10]
        // int[] arr = {10 , 20 , 36 , 7100};
        int n = arr.length;
        for (int i=0; i< n; i++){
            if(arr[i]<35){
                System.out.println(arr[i]);
            }
            // else if  {
            //     System.out.println("print 35 number ");
            // }
            else{
                System.out.println("No one got marks less than 35");
            }
        }
    }
    
}
