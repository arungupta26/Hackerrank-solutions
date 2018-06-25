package com.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDifference {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int testCaseCount = sc.nextInt();
        int solution[] = new int[testCaseCount];

        for(int i = 0 ;i<testCaseCount;i++)
        {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int w[] = new int[n];
            for (int j = 0; j < n; j++) {
                w[j] = sc.nextInt();
            }

            solution[i] = solve(n,k,w);


        }

        for (int sol : solution)
            System.out.println(sol);
    }

    private static int solve(int n, int k, int[] array) {

        Arrays.sort(array);
        int sum = 0, sum1 = 0, sum2 = 0;

        // Getting the sum of the array
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Getting the sum of first k elements
        for (int i = 0; i < k; i++) {
            sum1 += array[i];
        }

        // Getting the sum of (n-k) elements
        for (int i = k; i < n; i++) {
            sum2 += array[i];
        }


        return Math.abs(sum1-sum2);

    }
}
