package recursion;

import java.util.Stack;

public class DeleteMiddleElementInAStack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Before deleting middle ");

        for (int i:st) {
            System.out.println(i);
        }
        deleteMiddle(st);
        System.out.println("After deleting middle ");
        for (int i:st) {
            System.out.println(i);
        }
    }

    public static void deleteMiddle(Stack st){
        if(st.isEmpty())
            return;
        int n = st.size();
        n/=2;
        solve(st,n);
    }

    public static void solve(Stack<Integer> st,int n){
        if(n==0){
            st.pop();
            return;
        }
        int top = st.pop();
        solve(st,n-1);
        st.push(top);
    }

}
