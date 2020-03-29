package com.kuliahOOP1;

import java.util.Scanner;

public class Kuliah1MainLingkaran1{
    public static void main(final String[] args) {
        
         /* *******************
           Main Lingkaran v1.0
           *******************

           Masukkan radius lingkaran (m): [masukan pengguna]
           Luas lungkaran tersebut (m2): [keluaranProgram]
           Keliling lingkaran tersebut(m): [keluaranProgram]

         */

        // print judul program
        printHeader();

        //buat objek Scanner dan Lingkaran
        Scanner scan = new Scanner(System.in);

        //buat objek lingkaran
        Kuliah1Lingkaran lingkaran_1 = new Kuliah1Lingkaran();

        // input radius lingkaran
        System.out.print("Masukkan radius lingkaran (m): ");
        lingkaran_1.radius = scan.nextDouble();
        scan.close();
        
        //keluaran program luas n keliling lingkaran
        System.out.println("Luas lingkaran tersebut (m2): " 
        + lingkaran_1.hitungLuas());
        System.out.println("Keliling lingkaran tersebut (m): " 
        + lingkaran_1.hitungKeliling());

    }

    // method untuk print judul program
    private static void printHeader(){
        System.out.println("*******************");
        System.out.println("Main Lingkaran v1.0");
        System.out.println("*******************\n");
    }

}
