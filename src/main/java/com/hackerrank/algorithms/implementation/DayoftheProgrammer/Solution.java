package com.hackerrank.algorithms.implementation.DayoftheProgrammer;

import java.util.Scanner;

public class Solution {

    static String solve(int year) {

        String ret = ".09.";

        if (year == 1918) {
            ret = "26" + ret + "1918";
        } else if (year < 1918 && year % 4 == 0) {
            ret = "12" + ret + year;

        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            ret = "12" + ret+ year;
        } else
            ret = "13" + ret+ year;

        return ret ;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  int year = in.nextInt();
        String result = solve(1918);
        System.out.println(result);
    }
}
