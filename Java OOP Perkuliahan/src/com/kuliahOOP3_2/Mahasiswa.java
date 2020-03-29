package com.kuliahOOP3_2;

public class Mahasiswa{
    
    private String nama;
    private Double IPK;
    private String NIM;
    private double lamaStudi;
    private String predikatKelulusan;

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
        return ("Nama mahasiswa : "  + getNama() + "\n" +
               "NIM : " + getNIM()  + "\n" +
               "IPK : " + getIPK() + "\n" +
               "Lama studi (tahun) : " + getLamaStudi() + "\n" + 
               "Predikat kelulusan : " + getPredikat());
    }
}