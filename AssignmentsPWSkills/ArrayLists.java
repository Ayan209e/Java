package AssignmentsPWSkills;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void inputList(ArrayList<Integer> arr,int n){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Elements Of List:");
        for(int i=0;i<n;i++){
            arr.add(s.nextInt());
        }
    }
    public static void printList(ArrayList<Integer> arr,int n){
        System.out.print("Enter Elements Of List:");
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length Of Arraylist: ");
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        inputList(list,n);



//        Q1. Write a Java program to insert an element into given array list of size n at the first position.
/*

        System.out.print("Enter Element To Be Inserted: ");
        int x=s.nextInt();
        list.add(0,x);
        printList(list,n);
*/


//        Q2. Write a Java program to remove the third element from given arraylist of size n.
/*
        list.remove(2);
        printList(list,n);
        */


//        Q3. Write a Java program to swap two elements in an array list of size n.
/*
        System.out.println("Enter Indices To Swap:");
        int i=s.nextInt();
        int j= s.nextInt();
        Collections.swap(list,i,j);
        printList(list,n);
        */


//        Q4. Given an input of some integers, sort the integers
/*

        Collections.sort(list);
        printList(list,n);
*/

//        Q5. Given an array of integers, print an arraylist containing only all positive integers present in
//        the array.If no positive integers found, print “NA”.

        if(list.size()==0){
            System.out.println("NA");
            return;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=0)
            System.out.print(list.get(i) + " ");
        }


    }
}
