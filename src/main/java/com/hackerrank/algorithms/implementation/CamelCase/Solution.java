package com.hackerrank.algorithms.implementation.CamelCase;

import java.util.*;


public class Solution {

    static int camelcase(String s) {
        // Complete this function
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int ascii = ch;
            if (ascii > 64 && ascii < 91)
                count++;
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}