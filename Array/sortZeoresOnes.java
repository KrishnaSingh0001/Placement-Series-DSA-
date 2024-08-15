public class sortZeoresOnes {
    public static void main(String[] args) {
        int arr[] = { 1,  0 , 0 ,1, 0,1, 0 , 0 , 0,1 };
        int n = arr.length;
        //Method 1
        // int noOfZeroes = 0;  
        // for(int i = 0 ; i<n; i++){
        //     if(arr[i]==0){
        //         noOfZeroes++;
        //     }
            
        // }
        // for(int i = 0 ; i<noOfZeroes ; i++){
        //     arr[i]=0;

        // }
        // for(int i = noOfZeroes ; i<n;i++){
        //     arr[i]=1;
        // }

        // for(int ele: arr){
        //     System.out.println(ele + " ");
        // }
        // System.out.println();
        

                        // Method -> 2 one pass solution 
        int i = 0 ;
        int j = n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            // if(i>j){     // Or use else if condition 
            //     break;
            // }

            
            else if(arr[i]==1 && arr[j]==0){
                arr[i]= 0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
    
}
