// String Compression Question (All FANG Company Question )
// In this Question we compress the String and know the length of the String 
public class Question1 {
    public static void main(String[] args) {
        String s = "aabbccc";
        char[] arr = s.toCharArray();
        String ans = " ";
        int i = 0 , j = 0 ;
        int l = s.length();
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
        System.out.println(l);
    }
    // System.out.println(l);
}
// public class Question1 {
//     public static void main(String[] args) {
//         int n = char.size();
//         int index = 0;
//         int i = 0 ;
//         while(i<n){
//             char curr_char = char [i];
//             count =0;

//         }
//     }
// }