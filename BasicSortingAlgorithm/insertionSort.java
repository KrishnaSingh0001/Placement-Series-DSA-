package BasicSortingAlgorithm;

public class insertionSort {
    public static void print(int [] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    // public static void swap(int [] arr, int i ,int  j ) {
        
    // }
    public static void main(String[] args) {
        int [] arr = {10 , -4 , 20 , 7 , -6 , 8 };
        int n = arr.length;
        // Insertion Sort 
        for(int i = 1; i<n ;i++){  // n-1 pas
            for(int j = i; j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                else{
                    break;
                }
            }
        }
        print(arr);
    }
    
}
