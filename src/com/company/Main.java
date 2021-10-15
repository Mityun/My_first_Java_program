package com.company;

import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static int[] minToBegin(int[] inputArray){
        int min = inputArray[0];
        int index = 0;
        int[] res = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] < min) {
                min = inputArray[i];
                index = i;
            }
        }
        res[0] = min;
        boolean flag = true;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == index) {
                flag = false;
                continue;
            }
            if (flag)
                res[i + 1] = inputArray[i];
            else
                res[i] = inputArray[i];
        }
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = res[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] array = {200, -5555, 4852, -5555, 15, 78, 65};
        System.out.println(Arrays.toString(minToBegin(array)));
        System.out.println(Arrays.toString(array));

    }

}