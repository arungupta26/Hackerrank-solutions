package com.hackerrank.algorithms.implementation.CountingValleys;

import java.util.Scanner;

public class Solution {

    static int countingValleys(int n, String s) {

        int valletCount = 0;
        int level = 0;
        for (int i = 0; i < n; i++) {

            char st = s.charAt(i);
            if (level == -1 && st == 'U') {
                valletCount++;
            }

            if (st == 'U') {
                level++;
            } else {
                level--;
            }
        }
        return valletCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
