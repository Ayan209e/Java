package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.print("Enter No. Of Elements: ");
        int n=s.nextInt();
        System.out.print("Enter Stack Elements: ");
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            st.push(x);
        }


        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        Stack<Integer> copy=new Stack<>();
        while(!temp.isEmpty()){
            copy.push(temp.pop());
        }
        System.out.println(copy);
    }
}
