package com.hackerrank.algorithms.implementation.DrawingBook;

public class Solution {

    static int pageCount(int n, int p) {

        int forwardTurnsCount = p/2;
        int reverseTurnsCount = (n /2*2 + 1 - p) / 2;

        return forwardTurnsCount>reverseTurnsCount?reverseTurnsCount:forwardTurnsCount;

    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
    }
}
