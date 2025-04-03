package com.pbo2.p5.sync1;

public class TwoStrings {
    synchronized static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println(str2);
    }
}
