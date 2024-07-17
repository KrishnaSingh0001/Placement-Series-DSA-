public class MinimumValuesArrays {
    public static void main(String[] args) {
        int[] arr   = {1 , 2 , 100 , -20 , 50 };
        int n = arr.length;
        int mn = Integer.MAX_VALUE;
        for(int i = 0; i<n ; i++){
            if(arr[i]<mn){
                mn =arr[i];
            }
        }
        System.out.println("Minimum element in the Arrays is : " + mn);
    }
}
