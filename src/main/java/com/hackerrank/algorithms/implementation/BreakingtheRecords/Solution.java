package com.hackerrank.algorithms.implementation.BreakingtheRecords;



public class Solution {

    static int[] breakingRecords(int[] score) {

        int hs[] = new int[score.length];
        int ls[] = new int[score.length];


        for (int i = 0; i < score.length; i++) {
            hs[i] = -1;
            ls[i] = -1;
        }


        ls[0] = score[0];
        hs[0] = score[0];

        int hsCount = 0;
        int lsCount = 0;


        for (int i = 1; i < score.length; i++) {
            if (hs[i - 1] < score[i]) {
                hs[i] = score[i];
                hsCount++;
            } else {
                hs[i] = hs[i - 1];
            }

            if (ls[i - 1] > score[i]) {
                ls[i] = score[i];
                lsCount++;
            } else {
                ls[i] = ls[i - 1];
            }
        }

        int result[] = {hsCount,lsCount};
        return result;
    }


    public static void main(String[] args) {

        int[] input = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        for (int i = 0; i < breakingRecords(input).length; i++) {
            System.out.println(breakingRecords(input)[i]);

        }


    }
}
