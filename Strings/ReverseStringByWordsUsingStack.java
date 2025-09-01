package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringByWordsUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String res = reverseWords(s);
        System.out.println("after reversing ");
        System.out.println(res);
    }
    public static String reverseWords(String s) {
        String ans = "";
        Stack<String> st = new Stack<>();
        String curr = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(curr.length() > 0)
                    st.push(curr);
                curr = "";
            }
            else{
                curr += s.charAt(i);
            }
        }
        if(curr.length() > 0)
            st.push(curr);
        while(!st.isEmpty()){
            ans += st.pop();
            if(!st.isEmpty())
                ans+=" ";

        }
        return ans.trim();
    }
}
