package com.ithema.arithmeticoperato;

public class Encryption_dome {
    public static void main(String[] args) {
        int[] arr = {1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
            arr[i]%=10;
        }
        int[] arr_new = new int[arr.length];
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            arr_new[j]=arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr_new.length; i++) {
            sum=arr_new[i]+sum*10;
        }
        System.out.println(sum);
    }
}
