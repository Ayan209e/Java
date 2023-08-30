package Recursion;

import java.util.Scanner;

public class TrianglePattern {

    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle(r,c+1);
            System.out.print("*");
        }else{
            triangle(r-1,0);
            System.out.println();
        }

    }

    static void invertedTriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            invertedTriangle(r,c+1);
        }
        else{
            System.out.println();
            invertedTriangle(r-1,0);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        invertedTriangle(n,0);
        triangle(n,0);
    }

}
