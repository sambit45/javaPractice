package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        char[] newChar = s.toCharArray();
        reverse(newChar);
        System.out.println("Reversed String ");
        for (int i = 0; i < newChar.length; i++) {
            System.out.print(newChar[i]);
        }
    }
    public static void reverse(char[] s){
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
