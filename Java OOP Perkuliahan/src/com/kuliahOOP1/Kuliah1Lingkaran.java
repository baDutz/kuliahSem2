package com.kuliahOOP1;

public class Kuliah1Lingkaran{

    double radius;

    double hitungLuas(){
        return Math.PI*(Math.pow(radius,2));
        //System.out.println("Luas lingkaran tersebut (m2): " + luas);
    }
    
    double hitungKeliling(){
        return 2*Math.PI*radius;
        //System.out.println("Keliling lingkaran tersebut (m): " + keliling);
    }
}
