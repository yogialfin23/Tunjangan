package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double gPokok, Tunjangan, tGaji;
        String Status;

        Scanner sc = new Scanner(System.in);

        System.out.println("=====Program Tunjangan=====");
        System.out.print("Berapa Gaji Anda Perbulan?\t\t: Rp ");
        gPokok = sc.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        Status = sc.next();

        if (Status.equals("Menikah") || Status.equals(("menikah"))) {
            Tunjangan = gPokok * 0.35;
            tGaji = gPokok + Tunjangan;
        } else {
            Tunjangan = 0;
            tGaji = gPokok;
        }
        System.out.println();
        System.out.println("=====Hasil Perhitungan Gaji=====");
        System.out.println("Gaji Pokok\t\t: Rp " + gPokok);
        System.out.println("Tunjangan\t\t: Rp " + Tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + tGaji);

    }
}
