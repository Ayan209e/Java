package TwoD_Array;

import java.util.Scanner;

public class SpiralTraversal {
    static void input2DArray(int[][] arr,int r,int c){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
    }
    static void print2DArray(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void spiralTraversal(int[][] arr,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalEle=0;
        while(totalEle< r*c){
//            topRow ->leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalEle< r*c ;j++){
                System.out.print(arr[topRow][j] + " ");
                totalEle++;
            }
            topRow++;

//            rightCol ->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalEle< r*c ;i++){
                System.out.print(arr[i][rightCol] + " ");
                totalEle++;
            }
            rightCol--;

//            bottomRow ->rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalEle< r*c ;j--){
                System.out.print(arr[bottomRow][j] + " ");
                totalEle++;
            }
            bottomRow--;

//            leftCol ->bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalEle< r*c ;i--){
                System.out.print(arr[i][leftCol] + " ");
                totalEle++;
            }
            leftCol++;

        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. Of Rows Of Matrix: ");
        int r = s.nextInt();
        System.out.print("Enter No. Of Columns Of Matrix: ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        input2DArray(arr, r, c);
        spiralTraversal(arr,r,c);
    }
}
