package com.company;
import java.util.Scanner;
import java.io.PrintStream;

public class doesThePointBelongs2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args){
        double a = in.nextDouble();
        boolean res = (a >= -3 && a <= 5) || (a >= 9 && a <= 15);
        out.println(res);
    }

}
