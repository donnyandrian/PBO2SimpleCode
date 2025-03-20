package com.pbo2.p3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Latihan1 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void _main(String[] args) {
        Set set = new HashSet<>();
        set.add("Sistem");
        set.add("Teknologi Informasi");
        set.add("Bisnis");
        set.add("Digital");
        set.add("Kewirausahaan");

        System.out.println("Elemen pada HashSet: ");
        System.out.println(set);

        Set sortSet = new TreeSet<>(set);
        System.out.println("Elemen pada TreeSet: ");
        System.out.println(sortSet);
    }
}
