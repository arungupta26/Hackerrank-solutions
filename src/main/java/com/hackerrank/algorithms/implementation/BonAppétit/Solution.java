package com.hackerrank.algorithms.implementation.BonAppétit;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int bills[] = new int[n];

        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }

        int BrianCharged = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i != k)
                sum += bills[i];
        }

        if(sum/2 == BrianCharged)
            System.out.println("Bon Appetit");

        else
            System.out.println(BrianCharged-sum/2);
    }
}
