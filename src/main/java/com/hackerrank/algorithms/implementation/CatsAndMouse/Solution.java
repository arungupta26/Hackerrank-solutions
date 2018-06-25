package com.hackerrank.algorithms.implementation.CatsAndMouse;

public class Solution {

    static String catAndMouse(int x, int y, int z) {


        int catAtoMouseDistance = Math.abs(x - z);
        int catBtoMouseDistance = Math.abs(y - z);

        if (catAtoMouseDistance == catBtoMouseDistance)
            return "Mouse C";
        else
            return catAtoMouseDistance < catBtoMouseDistance ? "Cat A" : "Cat B";


    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
    }

}
