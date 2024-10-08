// package Strings;

public class Question2 {
     public static float getShortestPath(String path) {
        int x = 0 ,  y = 0 ;
        // int n = path.length;
        for(int i = 0 ; i<path.length() ; i++){
            char dir = path.charAt(i);
            // south
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
     }

     public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
     }
}
