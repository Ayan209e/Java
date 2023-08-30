package TwoD_Array;
// Time Complexity: O(row + col)
public class StaircaseSearch {

    static boolean staircaseSearch(int arr[][],int k){
        int i=0, j=arr[0].length-1;

        while(i<arr.length && j>=0){
            if(arr[i][j]==k){
                System.out.println("Found Key At: (" + i + "," + j + ")");
                return true;
            }
            else if(k<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int k=33;
        boolean ans=staircaseSearch(arr,k);
    }
}
