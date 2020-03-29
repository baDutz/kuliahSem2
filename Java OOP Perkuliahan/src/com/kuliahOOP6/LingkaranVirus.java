package com.kuliahOOP6;

import java.util.Scanner;
// belajar static member by pak ismiarta
class Lingkaran{
    private double radius;
    static int bilangan;
    static String id;

    public Lingkaran(){
        id = "VR" + (bilangan+1);
        this.radius = Math.pow(2,bilangan++);
        //bilangan+=1;
    }

    public static double getLuasLingkaran(double radius){
        return 3.14*Math.pow(radius, 2);
    }

    public static double getKelilingLingkaran(double radius){
        return 2*3.14*radius;
    }

    public String getDeskripsi(){
        return ("  id\t\t: " + id + "\n" 
               +"  radius (cm)\t: " + (int)this.radius + "\n"
               +"  luas (cm2)\t: " + getLuasLingkaran(this.radius) + "\n"
               +"  keliling (cm)\t: " + getKelilingLingkaran(this.radius));
    }
}

public class LingkaranVirus{
    public static void main(String[] args) {
        
       System.out.println("********************" + "\n"
                        + "Lingkaran Virus v2.0" + "\n"
                        + "********************");

       Scanner inputUser = new Scanner(System.in);

       System.out.print("\nBerapakah banyaknya lingkaran virus yang akan disebarkan ? ");
       //int jumlahLingkaran = inputUser.nextInt();

       Lingkaran[] kumpulanLingkaran = new Lingkaran[inputUser.nextInt()];
       inputUser.close();
       
       for (int i = 0; i < kumpulanLingkaran.length; i++) {
           kumpulanLingkaran[i] = new Lingkaran();
           //kumpulanLingkaran[i].radius *= Math.pow(2,i);
       }

       System.out.println("\nDeskripsi lingkaran yang tersebarkan" + "\n"
        + "------------------------------------");

       for (int j = 0; j < kumpulanLingkaran.length; j++) {
            System.out.println("lingkaran ke-" + (j+1) + "\n"
                               +kumpulanLingkaran[j].getDeskripsi());
            System.out.println();                  
       }
        
       /*
       for (int i = 0; i < kumpulanLingkaran.length; i++) {
           System.out.println("radius lingkaran ke-" + (i+1) + " : " + kumpulanLingkaran[i].radius);
        }
      */
    }
}