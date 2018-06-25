package com.hackerrank.algorithms.implementation.BetweenTwoSets;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {

        Set<Integer> uniqueFactorReturn = new HashSet<>();
        int minBValue = Integer.MAX_VALUE;
        for (int bValue : b) {
            if (minBValue > bValue)
                minBValue = bValue;
        }


        for (int bValue : b) {
            for (int aValue : a) {
                int x = bValue % aValue;
                if (x <= minBValue && x == 0) {
                    {
                        int factor = bValue / aValue;
                        if (factor <= minBValue && (bValue % factor) == 0)
                            uniqueFactorReturn.add(factor);
                    }
                }
            }
        }

        return uniqueFactorReturn.size();
    }

    static int getTotalX_alternative(int[] a, int[] b) {

        int counter = 0;


        int minB = Integer.MAX_VALUE;
        for (int bValue : b) {
            if (minB > bValue)
                minB = bValue;
        }

        int maxA = Integer.MIN_VALUE;
        for (int aValue : a) {
            if (maxA < aValue)
                maxA = aValue;
        }


        for (int i = maxA; i <= minB; i++) {
            boolean sentinel = false;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    sentinel = true;
                    break;
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (b[j] % i != 0) {
                    sentinel = true;
                    break;
                }
            }

            if (!sentinel) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int[] a = {1};
        int[] b = {72,48};
        System.out.println(getTotalX(a, b));

    }
}
