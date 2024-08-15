// Question : - Merge two Sorted arrays in a single sorted Arrays  
// Very Importatnt Question 

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a [] =  {11  , 33, 42, 62};
        int b [] = {26 , 54 , 64 , 81};
        // int m = a.length;
        // int n = b.length;
        int c [ ] = new int [a.length + b .length];
        int i = 0 , j = 0 , k = 0 ;
        // Merging 
        while(i<a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k]=a[i];
                i++; 
            }
            else{
                c[k]= b[j];
                j++; 
            }
            k++;
        }

        if(i==a.length){ // now taking element  from b only 
            while(j<b.length){
                c[k] = b[j];
                j++; k++;
            }
        }

        if(j == b.length){// now taking element from a only 
            while (i<a.length){
                c[k] = a[i];
                i++ ; k++;
            }
        }

        for(int ele : c){
            System.out.print(ele + " ");
        }

    }
    
}
