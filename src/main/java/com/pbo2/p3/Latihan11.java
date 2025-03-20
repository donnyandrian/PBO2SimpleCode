package com.pbo2.p3;

import java.util.*;

public class Latihan11 {
    static PriorityQueue<String> stringQueue;

    public static void _main(String[] args) {
        stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        // don't use iterator which may or may not
        // show the PriorityQueue's order
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
