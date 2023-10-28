package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextByte();
        System.out.println(a%10);
        a/=10;
        System.out.println(a%10);
        a/=10;
        System.out.println(a);

    }
}
