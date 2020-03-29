package com.kuliahOOP4;
import java.util.Scanner;

class Mahasiswa{
    
    private String nama;
    private double IPK;
    private String NIM;
    private double lamaStudi;
    private String predikatKelulusan;
    public static int classCode; //merupakan static member yang tidak perlu di instansiasi, milik bersama (berdasarkan kepemilikan)

    
    public Mahasiswa(){
        this("",0,"",0,""); //memanggil constructor lain didalam constructor
    }

    public Mahasiswa(String nama, double IPK, String NIM, double lamaStudi, String predikatKelulusan){
        this.nama = nama;
        this.IPK = IPK;
        this.NIM = NIM;
        this.lamaStudi = lamaStudi;
        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setIPK(double IPK){
        this.IPK = IPK;
    }

    public void setLamaStudi(double lamaStudi){
        this.lamaStudi = lamaStudi;
    }

    public String getNama(){
        return nama;
    }

    public String getNIM(){
        return NIM;
    }

    public double getLamaStudi(){
        return lamaStudi;
    }

    public Double getIPK(){
        return IPK;
    }

    public String getPredikat(){
        if(this.lamaStudi <= 4){
            if(this.IPK > 3.5){
               this.predikatKelulusan = "Cumlaude";
            }else if(this.IPK > 2.75){
               this.predikatKelulusan = "Sangat Memuaskan"; 
            }else if(this.IPK > 2){
               this.predikatKelulusan = "Memuaskan"; 
            }            
        }else{
            if(this.IPK > 2.75){
                this.predikatKelulusan = "Sangat Memuaskan";
            }else if(this.IPK > 2){
                this.predikatKelulusan = "Memuaskan";
            }
        }
        return this.predikatKelulusan;
    }

    public String getDeskripsi(){
        return ("Nama mahasiswa \t\t: "  + getNama() + "\n" +
               "NIM \t\t\t: " + getNIM()  + "\n" +
               "IPK \t\t\t: " + getIPK() + "\n" +
               "Lama studi (tahun) \t: " + getLamaStudi() + " tahun" + "\n" +
               "Predikat kelulusan \t: " + getPredikat() + "\n");
    }

    // dibawah ini merupakan method static, method static dapat dipanggil di kelas tanpa instansiasi
    public static void setClasscode(int classCode){ 
               Mahasiswa.classCode = classCode;
    }

    public static int getClassCode(){
        return Mahasiswa.classCode;
    }
}

public class CekPredikat{
    public static void main(String[] args) {
        System.out.println("Cek Predikat Kelulusan v2.0\n" +
                           "***************************\n");

       System.out.println("Pencatatan\n" +
                          "----------\n");

       int jumlahMahasiswa;
       Scanner input = new Scanner(System.in);
       
       System.out.print("Berapakah banyaknya mahasiswa yang akan dicatat? ");
       jumlahMahasiswa = input.nextInt();

       System.out.print("\n");

       Mahasiswa[] kumpulanMahasiswa = new Mahasiswa[jumlahMahasiswa];

      
       
       for (int i = 0; i < kumpulanMahasiswa.length; i++) {
           input.nextLine();
           kumpulanMahasiswa[i] = new Mahasiswa();

           System.out.println("Mahasiswa ke-" + (i + 1) + ":");

           System.out.print("Masukkan nama \t\t\t: ");
           kumpulanMahasiswa[i].setNama(input.nextLine());

           System.out.print("Masukkan NIM \t\t\t: ");
           kumpulanMahasiswa[i].setNIM(input.nextLine());

           System.out.print("Masukkan IPK \t\t\t: ");
           kumpulanMahasiswa[i].setIPK(input.nextDouble());

           System.out.print("Masukkan lama studi (tahun) \t: ");
           kumpulanMahasiswa[i].setLamaStudi(input.nextDouble());

           System.out.println();
       }

       input.close();

       System.out.println("Deskripsi kelulusan\n" +
                          "-------------------\n");

       for (int i = 0; i < kumpulanMahasiswa.length; i++) {
           System.out.println("Mahasiswa ke-" + (i+1) + "\n" + 
                               kumpulanMahasiswa[i].getDeskripsi());
       }

       Mahasiswa.classCode = 10; // cara akses variable static
    }
}