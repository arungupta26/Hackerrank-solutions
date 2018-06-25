package com.hackerrank.datastructure.arrays.SparseArrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static int[] solve(String[] strings, String[] queries) {


        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            Integer count = map.get(s);
            if (count == null)
                map.put(s, 1);
            else
                map.put(s, ++count);
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            res[i] = map.get(queries[i]) == null ? 0 : map.get(queries[i]);
        }

        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = solve(strings, queries);


        scanner.close();
    }
}
