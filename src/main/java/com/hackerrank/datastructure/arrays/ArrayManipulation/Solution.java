package com.hackerrank.datastructure.arrays.ArrayManipulation;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static int arrayManipulation(int n, int[][] queries) {


        int[] resArray = new int[n];

        for (int[] in : queries) {
            int start = in[0];
            int end = in[1];
            int k = in[2];

            for (int i = start - 1; i < end; i++) {
                resArray[i] += k;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : resArray) {
            if (i > max)
                max = i;
        }

        return max;

    }


    public static void main(String[] args) {



        int n = scanner.nextInt();

        int m = scanner.nextInt();

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }



        int res = arrayManipulation(n, queries);
    }
}
