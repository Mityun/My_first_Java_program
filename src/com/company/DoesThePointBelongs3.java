package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class DoesThePointBelongs3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        double a = in.nextDouble();

        if ((a >= -2 && a <= 3) || (a >= 6 && a <= 9))
            out.println("false");
        else
            out.println("true");
    }
}
