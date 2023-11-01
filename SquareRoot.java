package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int number = sc.nextInt();
        int left = 1;
        int right = number;
       int mind = 0;
        while (left<right ){
            mind = (left+right)/2;
            if(mind*mind==number)
            {
                System.out.println(mind);
                break;
            }else if(mind*mind>number){
                right = mind;
            }else if(mind*mind<number){

                left = mind;
            }if(right-left == 1){
                System.out.println(left);
                break;
            }
        }
    }
}
