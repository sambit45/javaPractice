package recursion;

import java.util.Stack;

public class SortStack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();

        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);
        System.out.println("Before Sorting... ");
        for(int i:st){
            System.out.print(i + " ");
        }
        sort(st);

        System.out.println("After Sorting... ");
        for(int i:st){
            System.out.print(i + " ");
        }
    }

    public static void sort(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        sort(st);

        insert(st,top);
    }

    public static void insert(Stack<Integer> st,int ele){
        if(st.isEmpty() || st.peek()<=ele){
            st.push(ele);
            return;
        }

        int top = st.pop();
        insert(st,ele);

        st.push(top);
    }

}

