package com.pbo2.p6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// BigDecimalCalculator
public class Latihan61 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            BigDecimal num1 = new BigDecimal(input.nextLine());

            System.out.print("Masukkan angka kedua: ");
            BigDecimal num2 = new BigDecimal(input.nextLine());

            System.out.println("Hasil:");
            System.out.println("Penjumlahan: "+ num1.add(num2));
            System.out.println("Pengurangan: "+ num1.subtract(num2));
            System.out.println("Perkalian: "+ num1.multiply(num2));
            System.out.println("Pembagian: "+ num1.divide(num2, 2, RoundingMode.HALF_UP));
        }
    }
}
