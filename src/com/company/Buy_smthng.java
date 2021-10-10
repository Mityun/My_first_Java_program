package com.company;
import java.io.PrintStream;
import java.util.Scanner;
public class Buy_smthng {
    public static PrintStream out = new PrintStream(System.out);
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double a = in.nextDouble();
        boolean b = a >= - 3;
        boolean c = b && a <= 5;
        boolean d = a >= 9;
        boolean f = d || a <= 15;
        boolean res = c && f;
        out.println(res);
    }
}
