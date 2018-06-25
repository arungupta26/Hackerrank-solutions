package com.hackerrank.algorithms.implementation.DivisibleSumPairs;

import java.util.Scanner;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int counter = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    counter++;
                    //System.out.println(ar[i] +","+ ar[j]);
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
