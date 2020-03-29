package com.kuliahOOP2;

import java.util.Scanner;

public class CatatBarang{
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        Barang barangBaru = new Barang();

        printHeader();

        System.out.println("\nPencatatan");
        System.out.println("----------");

        System.out.print("Masukkan nama barang: ");
        barangBaru.namaBarang = inputUser.nextLine();
        
        System.out.print("Masukkan harga jual dasar (Rp): ");
        barangBaru.hargaJualDasar = inputUser.nextInt();

        System.out.print("Masukkan potongan harga (%): ");
        barangBaru.persenPotong = inputUser.nextInt();

        inputUser.close();

        System.out.println("\nDeskripsi Barang");
        System.out.println("----------------");
        
        System.out.println(barangBaru.cetakDeskripsi());
    }
    public static void printHeader(){
        System.out.println("*****************");
        System.out.println("Catat Barang v1.0");
        System.out.println("*****************");
    }
    /*

        *****************
        Catat Barang v1.0
        *****************

        Pencatatan
        ----------
        Masukkan nama barang:
        Masukkan harga jual barang:
        Masukkan potongan harga:

        Deskripsi Barang
        ----------------
        Nama barang: 
        Harga jual:
        Potongan harga:
        Harga jual setelah pemotongan harga: Rp


        */
}