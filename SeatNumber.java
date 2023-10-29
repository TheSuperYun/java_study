package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class SeatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个座位号");
        int SeatNumber = sc.nextInt();
        if(SeatNumber<100 && SeatNumber>0 ){
            if(SeatNumber%2==1){
                System.out.println("坐左边");
            }else {
                System.out.println("坐右边");
            }
        }
    }
}
