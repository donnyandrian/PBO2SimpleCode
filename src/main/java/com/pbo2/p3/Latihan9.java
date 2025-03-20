package com.pbo2.p3;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Latihan9 {
    public static void _main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");

        Vector v = new Vector();
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        v.add("G");
        v.add("H");
        System.out.println("Before copy, Vector Contains : " + v);

        Collections.copy(v, arrayList);
        System.out.println("After copy, Vector Contains : " + v);
    }
}
