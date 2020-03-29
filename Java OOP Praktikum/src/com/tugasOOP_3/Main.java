package com.tugasOOP_3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Program Sistem Informasi Peternakan (SI Peter)" + "\n" +
                           "==============================================");

        Peternakan penjualAsep = new Peternakan();
        Peternakan penjualUcup = new Peternakan();
        Peternakan penjualBudi = new Peternakan();

        Scanner inputUser = new Scanner(System.in);

        //input Asep
        System.out.print("\nMasukkan nama penjual 1 \t: ");
        penjualAsep.setNama(inputUser.nextLine());
        System.out.print("Masukkan banyak penjualan ayam \t: ");
        penjualAsep.setBanyakPenjualanAyam(inputUser.nextInt());
        System.out.print("Masukkan banyak penjualan telur\t: ");
        penjualAsep.setBanyakPenjualanTelur(inputUser.nextInt());
        inputUser.nextLine();
        
        //input Ucup
        System.out.print("\nMasukkan nama penjual 2 \t: ");
        penjualUcup.setNama(inputUser.nextLine());
        System.out.print("Masukkan banyak penjualan ayam \t: ");
        penjualUcup.setBanyakPenjualanAyam(inputUser.nextInt());
        System.out.print("Masukkan banyak penjualan telur\t: ");
        penjualUcup.setBanyakPenjualanTelur(inputUser.nextInt());
        inputUser.nextLine();
        
        //input Budi
        System.out.print("\nMasukkan nama penjual 3 \t: ");
        penjualBudi.setNama(inputUser.nextLine());
        System.out.print("Masukkan banyak penjualan ayam \t: ");
        penjualBudi.setBanyakPenjualanAyam(inputUser.nextInt());
        System.out.print("Masukkan banyak penjualan telur\t: ");
        penjualBudi.setBanyakPenjualanTelur(inputUser.nextInt());
        inputUser.nextLine();

        
        inputUser.close();

        System.out.println("\nDeskripsi" + "\n" +
                             "=========\n");
        
        //output Asep
        penjualAsep.hitungPendapatanAyam();
        penjualAsep.hitungPendapatanTelur();
        penjualAsep.hitungAkumulasiPendapatan();
        //System.out.println(penjualAsep.getDeskripsi());   
        //output Ucup
        penjualUcup.hitungPendapatanAyam();
        penjualUcup.hitungPendapatanTelur();
        penjualUcup.hitungAkumulasiPendapatan();
        //System.out.println(penjualUcup.getDeskripsi());
        //output Budi
        penjualBudi.hitungPendapatanAyam();
        penjualBudi.hitungPendapatanTelur();
        penjualBudi.hitungAkumulasiPendapatan();
        //System.out.println(penjualBudi.getDeskripsi());
        

        System.out.println("Terimakasih telah menggunakan program kami!");
    }
}