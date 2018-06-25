package com.hackerrank.algorithms.implementation.SuperReducedString;
import java.util.*;

public class Solution {

    static String super_reduced_string(String str){
        /* Iterate through String, creating final result in a Stack */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop(); // since String has 2 adjacent equal characters
            } else {
                stack.push(ch);
            }
        }
        String returnString="";
        /* Print final result */
        if (stack.isEmpty()) {
            returnString="Empty String";
        } else {
            for (char ch : stack) {
                //System.out.print(ch);
                returnString+=""+ch;
            }
        }

        return returnString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
