public class PassingAnArraysToMethod {
    public static void main(String[] args) {
        // int x =5;
        int arr[] = {10 , 20 , 30 , 40 , 50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

    }
    public static void change(int arr[] ) {
        arr[0] = 90;
        
    }
    
}
