package Strings;

import java.util.Scanner;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String res = removeOuterParanthesis(s);
        System.out.println("after removing ");
        System.out.println(res);
    }
    public static String removeOuterParanthesis(String s) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                counter--;
            }
            if (counter!=0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                counter++;
            }
        }
        return ans.toString();
    }
}
