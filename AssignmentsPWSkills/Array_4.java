package AssignmentsPWSkills;

import java.util.Scanner;

public class Array_4 {
    public static void InputArray(int arr[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

    public static void PrintArray(int arr[]){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//        Q1. Given an array of integers of length n, and an integer m, (m < n), divide the array into 2 subarrays such
//        that 1 part contains m elements and the other part contains the rest of the elements. This division has to be
//        done such that the difference between the sum of elements of both the sub arrays is the maximum. You have to
//        print the maximum difference in the sum possible.




//        Q2. Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence which
//        contains equal numbers of 0 and 1. If no such subarray exists, print -1.



//        Q3. There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
//          The biker starts his trip on point 0 with altitude equal 0. You are given an integer array gain of length
//          n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the
//          highest altitude of a point.


//        Q4. Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest (Medium) amongst
//        all the possible ones). A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums
//        [middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1]. If middleIndex == 0, the left side sum is
//        considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
//        Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.



    }
}
