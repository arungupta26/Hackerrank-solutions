package com.codechef;

import java.util.Scanner;

public class CountSubstrings {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int testCases = sc.nextInt();
        int solution[] = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            String inputLeength = sc.next();
            String input = sc.next();
            solution[i] = solve(input);
        }

    }

    private static int solve(String input) {

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                // check(input.substring(i, j)) ? count++ : "";
            }
        }
        return count;

    }

    private static boolean check(String substring) {

        return false;
    }
}
