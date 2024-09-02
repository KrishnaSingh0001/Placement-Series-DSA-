// Give a String consuting of lowercase English alphabets . prints the character that is occuring most number of times .
// Most important Question to asked in interview 
package Strings;
import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int []  freq = new int [26];
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            int idx = (int )ch - 97;
            freq[idx]++;

        }
        int maxfreq = -1;
        for(int i = 0 ; i<freq.length;i++){
            maxfreq = Math.max(maxfreq,freq[i]);
        }
        for(int i = 0 ; i<freq.length;i++){
            if(freq[i]==maxfreq){
                char ch = (char) (i+97);
                System.out.println(ch + " ");
                
            }
        }
    }
}
