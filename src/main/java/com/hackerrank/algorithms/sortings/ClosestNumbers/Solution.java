package com.hackerrank.algorithms.sortings.ClosestNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbs = new int[n];

        for (int i = 0; i < n; i++) {
            numbs[i] = sc.nextInt();
        }
        int res[] = closestNumbers(numbs);

    }

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {

        int differeces[] = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            differeces[i - 1] = arr[i] - arr[i - 1];
            if (differeces[i - 1] < min)
                min = differeces[i - 1];
        }
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < differeces.length; i++) {
            if (differeces[i] == min) {
                output.add(arr[i]);
                output.add(arr[i+1]);
            }
        }


        int op [] = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            op[i] = output.get(i);
        }


        return op;

    }


}
