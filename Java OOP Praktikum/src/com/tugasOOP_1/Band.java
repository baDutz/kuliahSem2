package com.tugasOOP_1;

public class Band{

    private String namaBand;
    private int jumlahPersonil;
    private String genreBand;
    private int tahunDibentuk;
    private boolean statusKeaktifan;

    // ini constructor pertama
    public Band(String namaBand,int jumlahPersonil,String genreBand, 
                int tahunDibentuk,boolean statusKeaktifan){
                    this.namaBand = namaBand;
                    this.jumlahPersonil = jumlahPersonil;
                    this.genreBand = genreBand;
                    this.tahunDibentuk = tahunDibentuk;
                    this.statusKeaktifan = statusKeaktifan;
    }

    //ini constructor kedua
    public Band(int jumlahPersonil,String genreBand, int tahunDibentuk){
        this.genreBand = genreBand;
        this.jumlahPersonil = jumlahPersonil;
        this.tahunDibentuk = tahunDibentuk;
    }

    //ini constructor ketiga
    public Band(String namaBand){
        this.namaBand = namaBand;
    
    }
    
    public String profil(){
        return ("Nama Band        : " + this.namaBand        + "\n" +
                "Jumlah Personil  : " + this.jumlahPersonil  + "\n" +
                "Genre Band       : " + this.genreBand       + "\n" +
                "Tahun Dibentuk   : " + this.tahunDibentuk   + "\n" +
                "Status Keaktifan : " + statusKeaktifan() + "\n"
                );
    }

    public String cekGenre(){
        return this.genreBand;
    }

    public String statusKeaktifan(){
        if(this.statusKeaktifan){
            return "aktif";
        }else{
            return "tidak aktif";
        }
    }

    public void editBand(String namaBand){
        this.namaBand = namaBand;
    }

    public void editBand(int jumlahPersonil){
        this.jumlahPersonil = jumlahPersonil;
    }

    public void editBand(boolean statusKeaktifan){
        this.statusKeaktifan = statusKeaktifan;
    }

    public void editBand(String namaBand, int jumlahPersonil){
        this.namaBand = namaBand;
        this.jumlahPersonil = jumlahPersonil;
    }

    public void editBand(String namaBand,boolean statusKeaktifan){
        this.namaBand = namaBand;
        this.statusKeaktifan = statusKeaktifan;
    }

    public void editBand(int tahunDibentuk,String genreBand){
        this.tahunDibentuk = tahunDibentuk;
        this.genreBand = genreBand;
    }

}