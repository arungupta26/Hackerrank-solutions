package com.codechef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lapindromes {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCaseCount = sc.nextInt();

        boolean solution[] = new boolean[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            solution[i] = solve(sc.next());
        }

        for(boolean bool : solution)
        {
            if(bool)
                System.out.println("YES");
            else
                System.out.println("NO");

        }


    }

    private static boolean solve(String s) {

        Map<String, Integer> firstHalve = new HashMap<>();
        Map<String, Integer> secondHalve = new HashMap<>();
        // System.out.println("input ::"+s);
        firstHalve = findLapindromesMap(s.substring(0, s.length() / 2));

        if (s.length() % 2 == 0) {
            secondHalve = findLapindromesMap(s.substring(s.length() / 2, s.length()));
        } else {
            secondHalve = findLapindromesMap(s.substring(s.length() / 2 + 1, s.length()));
        }

        if (firstHalve.size() == secondHalve.size()) {

            for(Map.Entry<String,Integer> entry: firstHalve.entrySet())
            {
              String key =   entry.getKey();
              if(firstHalve.get(key) == secondHalve.get(key))
              {

              }else {
                  return false;
              }
            }
            return true;

        } else return false;

    }

    private static Map<String, Integer> findLapindromesMap(String input) {
        Map<String, Integer> charCount = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount.get(c + "") == null) {
                charCount.put(c + "", 1);
            } else
                charCount.put(c + "", charCount.get(c + "") + 1);

        }

        return charCount;

    }
}
