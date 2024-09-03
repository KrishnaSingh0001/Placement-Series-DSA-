package BasicSortingAlgorithm;

public class SortedArrayorNot {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3, 4 };
        boolean flag = true; // true means Sorted array
        for(int i = 0 ; i<arr.length -1 ; i++){
            if(arr[i]>arr[i+1]){
                flag =  false;   // false -> unsorted 
                break;
            }
        }
    }
    
}
