package com.company;
import java.io.PrintStream;
import java.util.Scanner;
public class LastBitsToZero {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        int n = in.nextInt();
        int i = in.nextInt();

        int binary = n >>> i;
        binary = binary << i;

        out.println(binary);
    }
}
