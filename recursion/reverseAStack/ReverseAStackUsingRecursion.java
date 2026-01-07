package recursion.reverseAStack;

import java.util.Stack;

//T.C - O(n2) n square  S.C - O(n) - Stack space

public class ReverseAStackUsingRecursion {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Before reverse...");
        for(int i:st)
            System.out.print(i + " ");
        reverseStack(st);
        System.out.println("After reverse...");
        for(int i:st)
            System.out.print(i + " ");
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top = st.pop();
        reverseStack(st);
        reverseTill(st,top);
    }

    public static void reverseTill(Stack<Integer> st,int ele){
        if(st.isEmpty())
        {
            st.push(ele);
            return;
        }
        int top = st.pop();
        reverseTill(st,ele);
        st.push(top);
    }
}
