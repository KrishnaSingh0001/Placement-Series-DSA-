// package Arrays Package;
import java .util.Arrays;
public class BuiltinMethod {
    public static void main(String[] args) {
        int arr [] = {1 , 290, 35 , 48, 5};
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}


// for each loop syntax ;-

// for(int ele : arr ){
    // System.out.println()
// }
