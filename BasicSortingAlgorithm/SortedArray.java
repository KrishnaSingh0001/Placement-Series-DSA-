
// This is the Basic Sorting Algorithm to check the array is shorted or not 


package BasicSortingAlgorithm;

public class SortedArray {
    public static boolean Sorting(String[] args) {
        int arr[] = {1 , 2 , 3, 4 };
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
}
