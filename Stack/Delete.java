package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Delete {

    public static void delete(Stack<Integer> st,int idx){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }

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

        System.out.println(st);
        delete(st,2);
        System.out.println(st);


    }
}
