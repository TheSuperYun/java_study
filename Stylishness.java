package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class Stylishness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的时髦度");
        int me = sc.nextInt();
        System.out.println("请输入对象的时髦度");
        int you =sc.nextInt();
        boolean result = me > you;
        System.out.println(result);

    }
}
