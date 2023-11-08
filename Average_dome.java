package com.ithema.arithmeticoperato;


import java.util.Scanner;

public class Average_dome {
    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.println(get_score(arr));
    }
    public static double get_score(int[] arr){
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < arr.length+1; i++) {
            System.out.println("请输入一个分数");
            int number = sc.nextInt();
            if(number>=0 && number<=100){
                arr[i-1] = number;
            }else {
                System.out.println("输入非法,请重新输入");
                i--;
            }
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        sum-=(max+min);
        return  sum /(arr.length-2);
    }
}
