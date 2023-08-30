package AssignmentsPWSkills;

import java.lang.reflect.Method;
import java.util.Scanner;
public class Methods {

     static int avg(int a, int b, int c){
        int ans=(a+b+c)/3;
        return ans;
    }

    static int vowels(String st){
         int count=0;
         int len=st.length();
         for(int i=0;i<len;i++){
             char ch=st.charAt(i);
             if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
                 count++;
             }
         }

         return count;
    }

    static String  mid(String st){
         int len=st.length();
         if(len%2==0){
             return st.substring(len/2 -1,len/2 +1 );
         }
         else{
             return st.substring(len/2,(len/2)+1);
         }
    }

    static void isLeapYear(int year){
         boolean ly=false;
         if(year % 4 == 0){
             ly=true;

             if(year % 100 ==0){
                 if(year%400==0){
                     ly=true;
                 }
                 else {
                     ly=false;
                 }
             }
         }
         else{
             ly=false;
         }
         if(ly){
             System.out.println("Leap Year");
         }
         else{
             System.out.println("Not A Leap Year");
         }
    }

    static int smallest(int a,int b,int c){
         if(a<b){
             if(a<c){
                 return a;
             }
             else{
                 return c;
             }
         }
         else{
             if(b<c){
                 return b;
             }
             else{
                 return c;
             }
         }
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

//        Q1. Average of Two Numbers;
//        avg() function;
        /*
        System.out.println("Enter Numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int ans= avg(a,b,c);
        System.out.println("Average: " + ans);
*/


//      Q2. Count Vowels in String (All Lowercase letters)
//       vowels() Function
        /*
        System.out.print("Enter String: ");
        String st=s.next();
        int ans=vowels(st);
        System.out.println("No. Of Vowels: " + ans);
*/

//        Q3. Middle Number of a String
//        mid() function
/*

        System.out.print("Enter String: ");
        String st=s.next();
        String ans=mid(st);
        System.out.println("Middle Element: " +ans);
*/

//        Q4. Check For LeapYear
//        isLeapYear() function
/*

        System.out.print("Enter Year: ");
        int year=s.nextInt();
        isLeapYear(year);
*/

//        Q5. Smallest of Three Numbers
//        smallest() function
/*
        System.out.print("Enter Numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int ans= smallest(a,b,c);
        System.out.println("Smallest: " + ans);
     */
    }
}
