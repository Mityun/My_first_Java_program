package com.company;
import java.util.Scanner;

public class next_even {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println((num + 2) - num % 2);
    }
}

