package Stack;

import java.util.Stack;

public class NextGreaterElement {

    static int[] nextGreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n= arr.length;
        int res[]=new int[n];
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] res=nextGreater(arr);
        for(int x:res){
            System.out.print(x +" ");
        }
    }
}
