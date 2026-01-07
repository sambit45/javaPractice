package recursion.reverseAStack;

//Time Complexity - O(n) and S.C - O(n)

import java.util.Stack;

public class ReverseStackUsingExtraDS {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Before reverse...");
        for(int i:st)
            System.out.print(i + " ");
        reverseStack(st);
        System.out.println("After reverse...");
        for(int i:st)
            System.out.print(i + " ");
    }

    public static void reverseStack(Stack<Integer> st){
        Stack<Integer> res = new Stack<>();
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
        st.addAll(res);
    }
}
