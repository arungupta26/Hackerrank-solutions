package com.hackerrank.datastructure.stack;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GameofTwoStacks {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        int lengthB = 0;
        int sum = 0;

        while (lengthB < b.length && sum + b[lengthB] <= x) {
            sum += b[lengthB];
            lengthB++;
        }

        int maxScore = lengthB;
        for (int lengthA = 1; lengthA <= a.length; lengthA++) {
            sum += a[lengthA - 1];

            while (sum > x && lengthB > 0) {
                lengthB--;
                sum -= b[lengthB];
                }

            if (sum > x) {
                break;
            }

            maxScore = Math.max(maxScore, lengthA + lengthB);

        }

        return maxScore;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
            System.out.println(result);


        }
    }
}
