package Arrays;
// O(n)
import java.util.Scanner;

public class BuyNSellStocks {
    static int[] inputArray(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    static int maxProfit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int currProfit=prices[i]-buyPrice;
                profit=Math.max(profit,currProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[]=inputArray();
        System.out.println("Maximum Profit: " + maxProfit(arr));
    }
}
