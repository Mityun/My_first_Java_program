package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Geogebra3 {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        double x = in.nextDouble(), y = in.nextDouble();
        if (y < 0)
            if (y > x * x - 2)
                out.println("YES");
            else
                out.println("NO");
        else
            if (y > (x * x - 2) && (y < x) && (y < -x))
                out.println("YES");
            else
                out.println("NO");

    }
}
