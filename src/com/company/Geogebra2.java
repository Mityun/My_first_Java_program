package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Geogebra2 {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        double a = in.nextDouble(), b = in.nextDouble();
        if (b > 0)
            if (b < 2 - a * a)
                out.println("YES");
            else
                out.println("NO");
        else
            if (b < 2 - a * a && b > a)
                out.println("YES");
            else
                out.println("NO");

    }
}
