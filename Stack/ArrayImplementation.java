package Stack;

import java.security.PublicKey;

public class ArrayImplementation {
    public static class Stack{
        int n=100;
        private int arr[]=new int[n];
        private int idx=-1;

        void push(int x){
            if(idx==n){
                System.out.println("Stack OverFlow");
            }
            else{
                idx++;
                arr[idx]=x;
            }
        }

        int peek(){
            if(idx<0){
                System.out.println("Stack Empty");
                return -1;
            }
            else{
                return arr[idx];
            }
        }

        int pop(){
            if(idx<0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else{
                int top=arr[idx];
                arr[idx]=0;
                idx--;
                return top;
            }
        }

        void display(){
            int i=0;
            while(i<=idx){
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println();
        }

        int size(){
            return idx+1;
        }

        boolean isEmpty(){
            if(idx<0){
                return true;
            }
            return false;
        }

        boolean isFull(){
            if(idx==n){
                return true;
            }
            return false;
        }


    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(8);
        st.push(13);
        st.push(6);
        st.push(1);

        st.display();

        st.pop();
        st.display();

        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
