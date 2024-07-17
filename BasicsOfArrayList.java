// package
import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        // int arr[] = new int[10];
        // int  [] arr = { 1,2,3,};
        ArrayList <Integer> arr = new ArrayList< >(6);
        arr.add(0,10); // is Equivalent to arr[0] = 10; 
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);
        for (int i = 0 ; i <= 5 ; i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
        arr.set(2,300);
        for(int i = 0 ; i<=5; i++){
            System.out.print(arr.get(i)+ " ");
         }
        // to add element
        arr.add(90); // push back 
        System.out.println();
        System.out.println(arr.size());
         
        for(int i = 0 ; i<=5; i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}
