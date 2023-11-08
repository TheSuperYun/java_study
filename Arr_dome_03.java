package com.ithema.arithmeticoperato;

public class Arr_dome_03 {
    public static void main(String[] args) {
        int[][] arr ={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int Sum =0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println(sum);
            Sum+=sum;
        }
        System.out.println(Sum);
    }
}
