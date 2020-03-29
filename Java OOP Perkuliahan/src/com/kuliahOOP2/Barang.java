package com.kuliahOOP2;

public class Barang{

        String namaBarang;
        int hargaJualDasar;
        double persenPotong;

    int hargaJualSetelahPotong(){
        return (int)(hargaJualDasar - hargaJualDasar*(persenPotong/100));
    }

    String cetakDeskripsi(){
        String desc =   String.format("Nama barang: %s",namaBarang)
                        + String.format("\nHarga jual dasar : %,d",hargaJualDasar)
                        + String.format("\nPotongan harga: %.0f %%",persenPotong)
                        + String.format("\nHarga jual setelah pemotongan harga: Rp %,d",hargaJualSetelahPotong());


        return desc;
    }


}