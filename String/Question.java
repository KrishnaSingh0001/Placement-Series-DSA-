//  Question 1 : - Check if a String is a Palindrome ("racecar" , "noon" , " madam")

package String;

public class Question {
    public static boolean isPalindrome(String str){
        int  n = str.length();
        for(int i = 0 ; i<str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
                // NOT A PAILDROME
                return false ;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
