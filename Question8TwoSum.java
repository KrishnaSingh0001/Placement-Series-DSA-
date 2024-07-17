//Question 8 : - find the doublet in the array whose sum is Equal to the given value x . (Two Sum )


public class Question8TwoSum {
    public static void main(String[] args) {
        int arr[] = {2 ,1 , 3 , 5 , 4 , 6};
        int x = 9;  
        int n = arr.length;

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n; j++){
                if (arr[i] + arr[j] ==x ){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
