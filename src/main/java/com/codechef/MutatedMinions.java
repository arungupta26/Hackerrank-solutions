package com.codechef;

import java.util.Scanner;

public class MutatedMinions {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int testCaseCount = sc.nextInt();
        int solution[] = new int[testCaseCount];
        for (int i = 0; i < testCaseCount; i++) {

            int minionCount = sc.nextInt();
            int dnaCount = sc.nextInt();
            int dnaValue[] = new int[minionCount];
            for (int dna = 0; dna < minionCount; dna++) {
                dnaValue[dna] = sc.nextInt();
            }

            solution[i] = solve(minionCount, dnaCount, dnaValue);
        }

        for (int sol : solution)
            System.out.println(sol);


    }

    private static int solve(int minionCount, int dnaCount, int[] dnaValue) {
        int wolvirineesCount = 0;


        for (int i = 0; i < minionCount; i++) {
           // System.out.println(dnaCount+" :: "+ dnaValue[i]);

            if ((dnaValue[i] + dnaCount) % 7 == 0) {
                wolvirineesCount++;
            }
        }


        return wolvirineesCount;
    }
}
