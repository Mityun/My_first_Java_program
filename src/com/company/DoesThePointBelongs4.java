package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class DoesThePointBelongs4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        int a = in.nextInt();

        boolean res = ((a >= 100 && a < 1000) && a % 5 == 0);

        out.println(res);

    }
}

