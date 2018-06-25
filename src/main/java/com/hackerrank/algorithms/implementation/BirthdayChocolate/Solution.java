package com.hackerrank.algorithms.implementation.BirthdayChocolate;


import java.util.Scanner;

public class Solution {

    static int solve(int n, int[] s, int d, int m){

        int count = 0;
        for(int i = 0;i<= n-m;i++)
        {
            if(calculateScope(s,i,m)==d)
                count++;
        }

        return count;

    }

    private static int calculateScope(int[] s, int i, int m) {

        int sum=0;
        int counter=0;

        while (true)
        {
          sum+=  s[i++];
          counter++;
          if(counter==m)
              break;
        }


        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}