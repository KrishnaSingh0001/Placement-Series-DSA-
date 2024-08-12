package Questions;

public class SumofDigit {
    public static void sum(int n) {
        int sum = 0 ; 
        // int n = 174;
        while (n!=0){
            sum = sum + n%10;
            n = n/10;
            // System.out.println(SumofDigit(n));
        }
        // return sum;
         
    }
    public static void main(String[] args) {
        int n = 167;
        // System.out.println(SumofDigit(n));
        
    }
    
    
}
