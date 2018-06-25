package com.hackerrank.algorithms.strings.strongPassword;

import java.util.Scanner;

public class Solution {

    private static String numbers = "0123456789";
    private static String lower_case = "abcdefghijklmnopqrstuvwxyz";
    private static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String special_characters = "!@#$%^&*()-+";

    static int minimumNumber(int n, String password) {

        boolean lowerFlag,upperFlag,numFlag,symolFlag;

        for(char c : password.toCharArray())
        {
            if(numbers.contains(c+"")) {
                numFlag=true;
            }

            if(lower_case.contains(c+""))
                lowerFlag=true;


            if(upper_case.contains(c+""))
                upperFlag=true;


            if(special_characters.contains(c+""))
                symolFlag =true;

        }

return 0;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
