package com.hackerrank.algorithms.sortings.InsertionSortPart2;


import java.util.Scanner;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int s, int[] ar) {

        for (int i = 0; i < s - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (ar[j] < ar[j - 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                    j--;
                } else {
                    break;
                }
            }
            printArray(ar);
        }

    }

    private static void printArray(int[] arr) {

        for (int i : arr)
            System.out.print(i);
        System.out.println();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
