package com.praktikumOOP2;

import java.util.*;

class Lingkaran{
    private double radius;
    private double phi = 3.14;


    public Lingkaran(){
        this.radius = 7;
    }

    public Lingkaran(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double kelilingLingkaran(){
        return 2*phi*radius;
    }

    public double luasLingkaran(){
        return phi*Math.pow(radius, 2);
    }
}

class SegiEmpat{
    private int panjang;
    private int lebar;

    public SegiEmpat(){
        this.panjang = 7;
    }

    public SegiEmpat(int panjang){
        this.panjang = panjang;
    }

    public SegiEmpat(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int kelilingSegiEmpat(){
        return 2*(panjang + lebar);
    }
    
    public int luasSegiEmpat(){
        return panjang*lebar;
    }
}

public class Solution {
        
    public static void main(String[] args) {
        //jangan dihapus
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        
        //lakukan instansiasi (lengkapi code di bawah)
        Lingkaran l_kosong  = new Lingkaran(); 
        Lingkaran l_isi     = new Lingkaran(a);
        SegiEmpat se_kosong = new SegiEmpat();
        SegiEmpat se_satu   = new SegiEmpat(a);
        SegiEmpat se_dua    = new SegiEmpat(a,b);
     
       
        System.out.println(l_kosong.getRadius());
        System.out.println(l_kosong.kelilingLingkaran());
        System.out.println(l_kosong.luasLingkaran());
        
        System.out.println(l_isi.getRadius());
        System.out.println(l_isi.kelilingLingkaran());
        System.out.println(l_isi.luasLingkaran());
        
        System.out.println(se_kosong.kelilingSegiEmpat());
        System.out.println(se_kosong.luasSegiEmpat());

        System.out.println(se_satu.kelilingSegiEmpat());
        System.out.println(se_satu.luasSegiEmpat());
        
        System.out.println(se_dua.kelilingSegiEmpat());
        System.out.println(se_dua.luasSegiEmpat());

    }
}