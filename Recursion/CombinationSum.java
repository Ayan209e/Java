package Recursion;
import java.util.*;
public class CombinationSum {
    static ArrayList<ArrayList<Integer> > combinationSum(ArrayList<Integer> arr, int sum) {
        ArrayList<ArrayList<Integer> > ans= new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(arr);
        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    static void findNumbers(ArrayList<ArrayList<Integer> > ans, ArrayList<Integer> arr, int sum, int index, ArrayList<Integer> temp) {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            if ((sum - arr.get(i)) >= 0) {
                temp.add(arr.get(i));
                findNumbers(ans, arr, sum - arr.get(i), i, temp);
                temp.remove(arr.get(i));
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(7);
        int sum = 7;
        ArrayList<ArrayList<Integer> > ans = combinationSum(arr, sum);
        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < ans.get(i).size()-1; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(ans.get(i).get(ans.get(i).size()-1));
            System.out.print("] ");
        }
    }
}
