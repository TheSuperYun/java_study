package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数");
        int score = sc.nextInt();
        if(95<=score && score<=100){
            System.out.println("自行车一辆");
        }else if(90<=score && score<=100){
            System.out.println("游乐场一天");
        }else if(score>=80 && score<=100){
            System.out.println("变形金刚");
        }else{
            System.out.println("打一顿");
        }
    }
}
