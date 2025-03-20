package com.pbo2.p3;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Latihan8 {
    public static void _main(String[] args) {
        Vector v = new Vector();

        // add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");

        System.out.println("Vector contains : " + v);

        Enumeration e = v.elements();

        ArrayList aList = Collections.list(e);
        System.out.println("Arraylist contains : " + aList);
    }
}
