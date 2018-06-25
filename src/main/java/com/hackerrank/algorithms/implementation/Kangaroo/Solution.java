package com.hackerrank.algorithms.implementation.Kangaroo;

import java.util.*;

public class Solution {


    /**
     * alternative method using slope concept
     * @param x1
     * @param v1
     * @param x2
     * @param v2
     * @return
     */
    static String kangaroo_alternative(int x1, int v1, int x2, int v2) {


        String isTheyArSamePosition = "NO";
        if (x1 == x2) {
            return "YES";
        } else if ((x1 < x2 && v1 > v2) || (x1 > x2 && v1 < v2)) {
            float t;
            t = (float) (x2 - x1) / (float) (v1 - v2);
            if (Math.floor(t) == t) {
                return "YES";
            }
        }
        return isTheyArSamePosition;
    }

    static String kangaroo_alternative_2(int x1, int v1, int x2, int v2) {

        if (v2 >= v1) {
            return"NO";
        } else if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String isTheyArSamePosition = "NO";
        int tempx1 = 0;
        int tempx2 = 0;

        if (x1 > x2 || v2 > v1)
            return isTheyArSamePosition;

        for (int i = 1; true; i++) {

            if ((x1 + tempx1) == (x2 + tempx2)) {
                isTheyArSamePosition = "YES";
                break;


            }
            if ((x1 + tempx1) > (x2 + tempx2))
                break;
            else {
                tempx1 = v1 * i;
                tempx2 = v2 * i;
            }
        }

        return isTheyArSamePosition;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
      //  long l1 = System.nanoTime();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
      //  System.out.println(System.nanoTime()-l1);
    }

}
