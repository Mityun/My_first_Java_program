package com.company;

import java.util.Scanner;
import java.io.PrintStream;

public class DoesThePointDelongs5 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args){

        int a=in.nextInt(), b=in.nextInt(), c=in.nextInt();
        out.println(a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 || b % 2 == 0 && c % 2 == 0);
    }
}
