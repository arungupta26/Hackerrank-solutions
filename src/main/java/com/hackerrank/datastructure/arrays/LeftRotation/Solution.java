package com.hackerrank.datastructure.arrays.LeftRotation;

import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            String[] nd = scan.nextLine().split(" ");

            int n = Integer.parseInt(nd[0].trim());

            int d = Integer.parseInt(nd[1].trim());

            int[] a = new int[n];

            String[] aItems = scan.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }


            a = leftRotate(a, d);


            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

        }

    private static int[] leftRotate(int[] input, int rotation ) {

        int firstElement = rotation % input.length;

        int[] output = new int[input.length];
        int j=0;
        for (int i = firstElement  ; i < input.length; i++,j++) {
            output[j] = input[ i ];
        }

        for (int i = 0; i < firstElement; i++,j++) {
            output[j] = input[ i ];
        }


        return output;

    }
}
