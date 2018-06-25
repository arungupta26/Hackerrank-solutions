package com.topcoders.ProblemStatementforPrimePolynom;

public class Solution {


    private static boolean prime;

    public static void main(String[] args) {


        int     a = 1,
                b = -79,
                c = 1601;
        int result = 0;

        for (int i = 0; true; i++) {
            int temp = a * i * i + b * i + c;

            if (!isPrime(temp)) {
                result = i;
                break;

            }

        }

        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}
