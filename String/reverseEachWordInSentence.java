//// Reverse each word in a given sentence (Ex : - I am Krishna Singh -> i ma anhsirK hgniS )

// package String;
import java.util.*;
public class reverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // reverse(sb , 2 , 4);
        // System.out.println(sb);
        int n = sb.length();
        int i = 0 , j=0;
        while(j<n){
            if(sb.charAt(j)!= ' '){
                j++;
            }
            else{
                reverse(sb , 2 , 4);
            }
        }

    }

    public static void reverse(StringBuilder sb , int i , int j ){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setChartAt(i ,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++ ;
            j--;
        }
    }
    
}
