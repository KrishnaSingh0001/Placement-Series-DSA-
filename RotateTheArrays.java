//Rotate the Arrays 'a' by k steps , where k is non - negative .

public class RotateTheArrays {
    public static void main(String[] args , int k ) {
        int arr [] = { 10 , 20 , 30 , 40 , 50 };   // n = 7
        int n = arr.length;
        k = k%n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k,n-1);
        reverse(arr , 0 , n-1);

    }

    private static void reverse(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'reverse'");
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print(arr[i] + " ");
    } 
    // System.out.println();

}
