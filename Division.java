package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chushu = sc.nextInt();
        int beichus = sc.nextInt();
        int shang = 0;
        while (beichus>=chushu){
            beichus -= chushu;
            shang++;
        }
        System.out.println(shang);
        System.out.println(beichus);
    }
}
