package com.hackerrank.algorithms.implementation.SockMerchant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : ar) {
            Integer ele = map.get(i);
            if (ele == null)
                ele = 0;

            map.put(i, ele + 1);

        }

        int sumOfPairs = map.entrySet().stream().mapToInt(e -> e.getValue() / 2).sum();
        return sumOfPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
