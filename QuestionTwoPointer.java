// Question : - Write a program to reverse the array without using any extra array . 

public class QuestionTwoPointer {
    public static void main(String[] args) {
        int [] arr = {1 ,2 , 3, 4, 5 , 6 };
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            // System.out.print (arr[i] + ",");

        }
        System.out.println();
        // for revese 
        // for(int i = 0 ; i<n/2;i++){
        //     int j = n-1-i;
        //     int temp = arr[i];
        //     arr[i]= arr[j];
        //     arr[j]= temp;
        // }
        int i = 0 , j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.println(ele + " ");
        }
    }
    
}
