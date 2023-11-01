package com.ithema.arithmeticoperato;

import java.util.Scanner;

public class EncounterSevenPasses {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i%7==0) {
                continue;
            }else if(i%10==7) {

                continue;
            }else if(i>10){
                int tem=0;
                tem = i;
                tem/=10;
                if(tem%10==7){
                    continue;
                }

            }
            System.out.println(i);

        }
    }
}
