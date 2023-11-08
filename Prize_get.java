package com.ithema.arithmeticoperato;

import java.util.Random;

public class Prize_get {
    public static void main(String[] args) {
        int[] arr ={2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
