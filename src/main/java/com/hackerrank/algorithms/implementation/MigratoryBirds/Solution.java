package com.hackerrank.algorithms.implementation.MigratoryBirds;

import java.util.Scanner;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {

        int counter[] = new int[5];
        int result = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            counter[ar[i]-1]++;
        }

        for (int i = 0; i <5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }
        return result+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
