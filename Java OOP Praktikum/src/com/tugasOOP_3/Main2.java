package com.tugasOOP_3;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        System.out.println("======================"+ "\n" 
                         + "Program Peternakan v.1"+ "\n"
                         + "======================"+ "\n");
        
        System.out.println("anda harus mempekerjakan orang untuk menjual ayam dan telur di peternakan anda.");
        System.out.println("Stok awal ayam : " + Peternakan.banyakAyam);
        System.out.println("Stok awal telur: " + Peternakan.banyakTelur);

        Scanner inputUser = new Scanner(System.in);

        System.out.print("\nberapa orang yang ingin anda pekerjakan : ");
        Peternakan[] penjual = new Peternakan[inputUser.nextInt()];

        System.out.println("\nAkhirnya penjualan selesai... \nsilahkan masukkan data penjualan mereka untuk \nmenghitung hasil penjualan\n");

        for (int i = 0; i < penjual.length; i++) {
            inputUser.nextLine();
            penjual[i] = new Peternakan();

            System.out.println("Masukkan data penjual ke-" + (i+1) + " : " + "\n" +
                               "----------------------------");
            System.out.print("Nama : ");
            penjual[i].setNama(inputUser.nextLine());
            System.out.print("menjual ayam sebanyak : ");
            penjual[i].setBanyakPenjualanAyam(inputUser.nextInt());
            penjual[i].hitungPendapatanAyam();

            System.out.print("menjual telur sebanyak : ");
            penjual[i].setBanyakPenjualanTelur(inputUser.nextInt());
            penjual[i].hitungPendapatanTelur();

            penjual[i].hitungAkumulasiPendapatanPeternakan();

            System.out.print("\n");
        }
        inputUser.close();

        System.out.println("Deskripsi Penghasilan" + "\n" +
                           "=====================" + "\n");
        for (int i = 0; i < penjual.length; i++) {
            System.out.println(penjual[i].getDeskripsi(i + 1));
        }
    }
}