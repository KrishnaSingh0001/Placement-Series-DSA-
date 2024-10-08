// package Strings;

public class stringCompression {
    public static void main(String[] args) {
        String s = "aaaaannbbbuuuucccc";
        // String ans = "";
        char[] arr = s.toCharArray();
        String ans = " ";
        int i = 0 , j = 0 ;
        while(j<arr.length){
            if(arr[j]==arr[i]){
                j++;
            }
            else{
                ans += arr[i];
                int len = j-i;
                if(len>1){
                    ans +=len;
                    i = j;
                }
            }
        
        }
        ans += arr[i];
        int len = j-i;
        if(len>1){
        ans +=len;
        }
        System.out.println(ans);
        
    }
}

// public class stringCompression{
//     public static String Compression(String str ) {
//         String s = str.substring(0,1);
//         int count = 1 ; 
//         for(int i = 0 ; i<str.length() ; i++){
//             char curr = str.charAt(i);
//             char prev = str.charAt(i-1);

//             if(curr == prev){
//                 count ++;
//             }else{
//                 if(count >1){
//                     s+=count;
//                     count =1;
//                 }
//                 s+=curr;
//             }
//         }
//         if(count >1){
//             s+=count;
//             count =1;
//         }
//         return s;
//     }
// }
