package com.hackerrank.algorithms.sortings.BigSorting;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    /*
     * Complete the bigSorting function below.
     */
    static String[] bigSorting(String[] unsorted) {
        /*
         * Write your code here.
         */

        Arrays.sort(unsorted,new Comparator<String>() {
            @Override
            public int compare(String a, String b)
            {
                return StringAsIntegerCompare(a,b);
            }
        });

        return unsorted;


    }

    static int StringAsIntegerCompare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String input[] = {"1","2222"};
        System.out.println(bigSorting(input));
    }
}


