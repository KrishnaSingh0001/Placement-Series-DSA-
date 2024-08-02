package Questions;

public class ReverseaNumber {
    public static void reversed(String[] args) {
        // int number = 1234; 
        int num = 1234, reversed = 0;
    
    System.out.println("Original Number: " + num);

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
    }
}













// public class RotateTheArrays {
//     public static void main(String[] args , int k ) {
//         int arr [] = { 10 , 20 , 30 , 40 , 50 };   // n = 7
//         int n = arr.length;
//         k = k%n;
//         reverse(arr , 0 , n-k-1);
//         reverse(arr , n-k,n-1);
//         reverse(arr , 0 , n-1);

//     }

//     private static void reverse(int[] arr, int i, int j) {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'reverse'");
//         while(i<=j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         System.out.print(arr[i] + " ");
//     } 
//     // System.out.println();

// }

