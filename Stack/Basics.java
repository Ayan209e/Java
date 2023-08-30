package Stack;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(16);
        st.push(3);

//        Display
        System.out.println(st);

//        Peek
        System.out.println(st.peek());

//        Pop
        st.pop();
        System.out.println(st);

//        Size
        System.out.println(st.size());
    }
}
