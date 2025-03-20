package com.pbo2.p3;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Quiz2 {
    public static void _main(String[] args) {
        // Buat objek
        ArrayList warna = new ArrayList();
        ArrayList warnaDihapus = new ArrayList();

        // Tambahkan warna awal
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        // Print warna awal
        System.out.println("WARNA: ");
        System.out.println(warna + "\n");

        // Tambahkan warna yang ingin dihapus
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        // Print warna yang ingin dihapus
        System.out.println("Warna yang dihapus: ");
        System.out.println(warnaDihapus + "\n");

        // Hapus warna yang ingin dihapus
        warna.removeAll(warnaDihapus);

        // Print output (warna yang tersisa)
        System.out.println("Output :");
        System.out.println("Warna :");
        System.out.println(warna);
    }
}
