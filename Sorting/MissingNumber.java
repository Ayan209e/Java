package Sorting;
//https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public int missingNumber(int[] nums) {
        sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
}
