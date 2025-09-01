package Strings;

import java.util.Scanner;


public class ReverseStringByWordsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String res = reverseWords(s);
        System.out.println("after reversing ");
        System.out.println(res);
    }

    public static void reverse(StringBuilder sb,int i,int j){
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && (i > 0 && s.charAt(i - 1) == ' ')) {
                continue;
            }else
                sb.append(s.charAt(i));
        }
        int k=0;
        for(int i = 0; i <= sb.length(); i++) {
            if(i == sb.length() || sb.charAt(i)==' ') {
                reverse(sb,k,i-1);
                k=i+1;
            }
        }

        return sb.toString();

    }
}
