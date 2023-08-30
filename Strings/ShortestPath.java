package Strings;

import java.util.Scanner;

// Directions: NEWS
public class ShortestPath {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Direction String: ");
        String Dir=s.next();
        int x=0,y=0;
        for(int i=0;i<Dir.length();i++){
            char d=Dir.charAt(i);
            if(d=='N'){
                y++;
            }
            else if (d=='S') {
                y--;
            }
            else if (d=='E') {
                x++;
            }
            else{
                x--;
            }
        }
        int xSq=x*x;
        int ySq=y*y;
        int sum=xSq+ySq;
        double ans=Math.sqrt(sum);
        System.out.printf("Shortest Path: %.2f" , ans);
    }
}
