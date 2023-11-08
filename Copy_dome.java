package com.ithema.arithmeticoperato;

import com.sun.source.tree.NewArrayTree;

public class Copy_dome {
    public static void main(String[] args) {
        int[] arr_1 = {1,2,3,4,5};
        int[] arr_2 = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_2[i] = arr_1[i];
        }
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i]+" ");
        }
    }
}
