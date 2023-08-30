package TwoD_Array;

import java.util.Scanner;

public class GenerateSpiralMatrix {
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
    static void spiralGenerator(int[][] arr,int n){
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int totalEle=1;
        while(totalEle<= n*n){
//            topRow ->leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalEle<= n*n ;j++){
                arr[topRow][j]=totalEle;
                totalEle++;
            }
            topRow++;

//            rightCol ->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalEle<= n*n ;i++){
                arr[i][rightCol]=totalEle;
                totalEle++;
            }
            rightCol--;

//            bottomRow ->rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalEle<= n*n ;j--){
                arr[bottomRow][j] =totalEle;
                totalEle++;
            }
            bottomRow--;

//            leftCol ->bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalEle<= n*n ;i--){
                arr[i][leftCol] =totalEle;
                totalEle++;
            }
            leftCol++;

        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value Of N: ");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        spiralGenerator(arr,n);
        print2DArray(arr,n,n);
    }
}
