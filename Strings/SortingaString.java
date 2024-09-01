package Strings;

public class SortingaString {
    public static void main(String[] args) {
        String s = "raghav";
        char [] ch = s.toCharArray();
        for(char ele : ch ){
            System.out.print(ele);
        }
        System.out.println();
        // Array.sort(ch);
        for(char ele : ch){
            System.out.println(ele);
        }
        System.out.println();
    }
}
