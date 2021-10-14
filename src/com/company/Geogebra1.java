package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Geogebra1 {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        double a = in.nextDouble(), b = in.nextDouble();
        if (b > 0 && b < 0.5 && b < Math.sin(a) && a > 0 && a < 3.2)
            out.println("YES");
        else
            out.println("NO");
    }
}
