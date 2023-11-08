package com.ithema.arithmeticoperato;

import java.util.Random;

public class Price_tow {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length-1; i++) {
            int number = r.nextInt(33)+1;
            arr[i] = number;
        }
        arr[arr.length-1] = r.nextInt(16)+1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
