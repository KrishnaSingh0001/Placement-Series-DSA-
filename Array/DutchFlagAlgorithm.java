public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0};
        int n  = arr.length;
        // method no 1 
        int noOfZeroes = 0 ; 
        int noOfOnes = 0;
        for(int i = 0 ; i<n; i++){
            if(arr[i]==0){
                noOfZeroes++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }

        }
        for(int i=0 ; i<n; i++){
            if(i<noOfZeroes){
                arr[i]=0;

            }
            else if(i<noOfZeroes + noOfOnes){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
        

        // Method Number 2  (Dutch flag Algorithm )

        // int mid = 0 ;
        // int hi = n-1 ; 
        // int lo = 0;

        // while(mid<=hi){
        //     if(arr[mid] ==0){
        //         int temp = arr[mid];
        //         arr[mid]=arr[lo];
        //         arr[lo]= temp;
        //         lo++;
        //         mid++;

        //     }

        //     else if (arr[mid]==1){
        //         mid ++;
        //     }
        //     else{
        //         int temp = arr[mid];
        //         arr[mid]=arr[hi];
        //         arr[hi]=temp;
        //         hi--;
        //     }
        // }
        // for(int i = 0 ; i<n ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();


    }
}


