package com.hackerrank.datastructure.stack;

import java.util.HashMap;
import java.util.Map;

public class EqualStacks {

    public static void main(String[] args) {



        int[] h1 ={1 ,1 ,1 ,1 ,2};
        int[] h2={3, 7};
        int[] h3 ={1, 3 ,1};
        System.out.println(equalStacks(h1,h2,h3));

    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {


        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = h1.length-2; i>-1; i--) {
            h1[i] = h1[i] + h1[i + 1];
        }

        for (int i = h2.length-2; i>-1; i--) {
            h2[i] = h2[i] + h2[i + 1];
        }

        for (int i = h3.length-2; i>-1; i--) {
            h3[i] = h3[i] + h3[i + 1];
        }

        for (int i : h1) {
            if (counter.get(i) == null) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        for (int i : h2) {
            if (counter.get(i) == null) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        for (int i : h3) {
            if (counter.get(i) == null) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        int maxCount = 0;
        for (Map.Entry entry : counter.entrySet()) {
            int key = (int) entry.getKey();

            if (counter.get(key) == 3)
                maxCount = key;

        }


        return maxCount;


    }
}
