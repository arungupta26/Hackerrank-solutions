package com.hackerrank.java.introductio.JavaStdinAndStdout;

import java.util.Scanner;

public class Java_Stdin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        String name= scan.nextLine();
        System.out.println("name :: "+name);
        name+=scan.nextLine();
      //  System.out.println(name);

        scan.close();
        // Write your code here.

        System.out.println("String: " + name);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
