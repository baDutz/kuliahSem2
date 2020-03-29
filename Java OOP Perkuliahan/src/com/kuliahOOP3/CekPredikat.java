package com.kuliahOOP3;

import java.util.Scanner;
import com.kuliahOOP3_2.Mahasiswa;

public class CekPredikat{
    public static void main(String[] args) {
    
        System.out.println(  "*****************\n"
                            +"Cek Predikat v1.0\n"
                            +"*****************\n");


        System.out.println(  "Pencatatan\n"
                            +"----------");

        
        Scanner scan = new Scanner(System.in);
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        System.out.print("Masukkan nama mahasiswa : ");
        mahasiswa1.setNama(scan.nextLine());

        System.out.print("Masukkan NIM : ");
        mahasiswa1.setNIM(scan.nextLine());

        System.out.print("Masukkan IPK : ");
        mahasiswa1.setIPK(scan.nextDouble());

        System.out.print("Masukkan lama studi (tahun) : ");
        mahasiswa1.setLamaStudi(scan.nextDouble());

        scan.close();               
                            
        System.out.println(  "\nDeskripsi Kelulusan"
                            +"\n-------------------");

        System.out.println(mahasiswa1.getDeskripsi());

                          
        /*
        *****************
        Cek Predikat v1.0
        *****************

        Pencatatan
        ----------
        Masukkan nama mahasisua:
        Masukkan NIM:
        Masukkan IPK:
        Lama studi:

        Deskripsi Kelulusan
        ----------------
        Nama mahasisua: 
        NIM:
        IPK:
        Lama studi (tahun) : 
        predikat kelulusan :
        */
    }
}