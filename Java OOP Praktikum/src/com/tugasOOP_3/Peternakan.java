package com.tugasOOP_3;

public class Peternakan{

    //representasi peternakan
    static int banyakAyam   = 1000;
    private int sisaAyam;
    static int banyakTelur  = 5000;
    private int sisaTelur;
    private int hargaAyam   = 25000;
    private int hargaTelur  = 1000;
    private int akumulasiPendapatanPeternakan;

    //representasi penjual
    private String namaPenjual;
    private int banyakPenjualanAyam;
    private int banyakPenjualanTelur;
    private int pendapatanAyam;
    private int pendapatanTelur;
    private int akumulasiPendapatanToko;

    public void setNama(String namaPenjual){
        this.namaPenjual = namaPenjual;
    }
    
    public void setBanyakPenjualanAyam(int banyakPenjualanAyam){
        this.banyakPenjualanAyam = banyakPenjualanAyam;
        banyakAyam -= this.banyakPenjualanAyam;
        this.sisaAyam = banyakAyam;
    }
    
    public void setBanyakPenjualanTelur(int banyakPenjualanTelur){
        this.banyakPenjualanTelur = banyakPenjualanTelur;
        banyakTelur -= this.banyakPenjualanTelur;
        this.sisaTelur = banyakTelur; 
    }
    
    public void hitungPendapatanTelur(){
        pendapatanTelur = banyakPenjualanTelur*hargaTelur;

        if(banyakPenjualanTelur <= 10){
            akumulasiPendapatanToko += 0;
        } else if(banyakPenjualanTelur > 10 && banyakPenjualanTelur <=30){
            akumulasiPendapatanToko += (int) (banyakPenjualanTelur * hargaTelur * 0.05);
        } else{
            akumulasiPendapatanToko += (int) (banyakPenjualanTelur * hargaTelur * 0.15);
        }   
    }

    public void hitungPendapatanAyam(){
        this.pendapatanAyam = banyakPenjualanAyam*hargaAyam;
        
        if(banyakPenjualanAyam <= 10){
            akumulasiPendapatanToko += 0;
        } else if(banyakPenjualanAyam > 10 && banyakPenjualanAyam <=30){
            akumulasiPendapatanToko +=  (int) (banyakPenjualanAyam*hargaAyam*0.1);
        } else{
            akumulasiPendapatanToko += (int) (banyakPenjualanAyam * hargaAyam * 0.2);
        }
    }
    
    public void hitungAkumulasiPendapatanPeternakan(){
        akumulasiPendapatanPeternakan = (this.pendapatanAyam + this.pendapatanTelur) - akumulasiPendapatanToko; 
    }

    public String getNamaPenjual(){
        return this.namaPenjual;
    }
        
    public int getBanyakPenjualanAyam(){
        return this.banyakPenjualanAyam;
    }
    
    public int getBanyakPenjualanTelur(){
        return this.banyakPenjualanTelur;
    }
    
    public int getPendapatanAyam(){
        return this.pendapatanAyam;
    }

    public int getPendapatanTelur(){
        return  this.pendapatanTelur;
    }

    public int getAkumulasiPendapatanPeternakan(){
        return this.akumulasiPendapatanPeternakan;
    }
    public int getAkumulasiPendapatanToko(){
        return this.akumulasiPendapatanToko;
    }
    

    public String getDeskripsi(int i){
        String buffer = "";
        String buffer2 = "";
        if(banyakPenjualanAyam < 10){
          buffer = "Bonus jual ayam \t: " + "Jual lebih banyak lagi!";
        }else if(banyakPenjualanAyam > 10 && banyakPenjualanAyam <= 30 ){
          buffer = "Bonus jual ayam \t: " + String.format("Rp %,d (10%%)",(int)(getPendapatanAyam()*0.1));
        }else {
          buffer = "Bonus jual ayam \t: " + String.format("Rp %,d (20%%)",(int)(getPendapatanAyam()*0.2));
        }

        if(banyakPenjualanTelur < 10){
            buffer2 = "Bonus jual telur \t: " + "Jual lebih banyak lagi!";
          }else if(banyakPenjualanTelur > 10 && banyakPenjualanTelur <= 30 ){
            buffer2 = "Bonus jual telur \t: " + String.format("Rp %,d (5%%)",(int)(getPendapatanTelur()*0.05));
          }else {
            buffer2 = "Bonus jual telur \t: " + String.format("Rp %,d (15%%)",(int)(getPendapatanTelur()*0.15));
          }
        
        return ("Penjual ke-" + i + " : " + "\n" +
                "--------------" + "\n" +    
               "Nama penjual  \t\t: " + getNamaPenjual() + "\n" +
               "Banyak penjualan ayam \t: " + getBanyakPenjualanAyam() + "\n" +
               "Banyak penjualan telur \t: " + getBanyakPenjualanTelur() + "\n\n" +
               "Pendapatan ayam \t: " + String.format("Rp %,d",getPendapatanAyam()) + "\n" +
               "Pendapatan telur \t: " + String.format("Rp %,d",getPendapatanTelur()) + "\n" +
                buffer + "\n" +
                buffer2 + "\n\n" +
               "Pendapatan peternakan \t: " + String.format("Rp %,d",getAkumulasiPendapatanPeternakan()) + "\n" +
               "Pendapatan penjual \t: " + String.format("Rp %,d",getAkumulasiPendapatanToko()) + "\n\n" +
               "Sisa ayam di peternakan : " + sisaAyam + "\n" +
               "Sisa telur di peternakan: " + sisaTelur + "\n");
    }
}