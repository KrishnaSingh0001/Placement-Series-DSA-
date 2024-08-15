public class SecondLargestArrays {
    public static void main(String[] args) {
        int[] arr   = {1 , 2 , 100 , 20 , 50 };
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i <n ;i++){
            if(arr[i]> mx){
                mx = arr[i];
                
            }
        }    
            int smx = Integer.MIN_VALUE;
            for(int i=0 ; i<n; i++){
                if(arr[i]!= mx){
                    smx = Math.max(smx,arr[i]);
                }
            }
            System.out.println("Maximum value is : "+  mx);
            System.out.println("Second Largest value is : " + smx);
        

    }
}
