package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class Number_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int ge = 0;
        while(temp!=0){
            ge = temp%10;
            temp/=10;
            sum = sum*10 +ge;
        }
        System.out.println(sum==num);
    }
}
