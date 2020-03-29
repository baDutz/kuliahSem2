package com.tugasOOP_1;

public class Tugas_1{
    public static void main(String[] args) {
        printHeader();

        System.out.println("======> BAND PERTAMA");
        Band band_1 = new Band("Dream Theater",5,"Progressive-Metal",
                                     1985,true);

        //menampilkan semua elemen profil                             
        System.out.println("Profil awal band\n" + 
                           "----------------\n" + band_1.profil());

        //menampilkan / mengecek status keaktifan
        System.out.println("Cek status keaktifan : " + band_1.statusKeaktifan() +"\n");

        //menampilkan / mengecek genre
        System.out.println("Cek genre : " + band_1.cekGenre() + "\n");

        //mengedit nama Band
        band_1.editBand("Led Zeppelin");

        //menampilkan profil stelah diedit namanya
        System.out.println("Setelah diubah nama\n" + 
                           "-------------------\n" + band_1.profil());
        
        //mengedit nama band dan personil
        band_1.editBand("Queen",4);
        System.out.println("Setelah diubah nama dan jumlah anggota\n" + 
                           "--------------------------------------\n" + band_1.profil());

        //mengedit nama band dan status keaktifan
        band_1.editBand("Aerosmith",true);
        System.out.println("Setelah diubah nama dan status keaktifan\n" + 
                           "----------------------------------------\n" + band_1.profil());

        /*-----------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -----------------------------------------------------------------------------------*/

        System.out.println("======> BAND KEDUA");
        Band band_2 = new Band(4,"Rock",2000);

        //menampilkan semua elemen profil                             
        System.out.println("Profil awal band\n" + 
                           "----------------\n" + band_2.profil());
        
        //menampilkan / mengecek status keaktifan
        System.out.println("Cek status keaktifan : " + band_2.statusKeaktifan() +"\n");

        //menampilkan / mengecek genre
        System.out.println("Cek genre : " + band_2.cekGenre() + "\n");

         //mengedit nama Band dan status keaktifan
         band_2.editBand("Avenged Sevenfold",true);
         System.out.println("Setelah diubah nama dan status keaktifan\n" + 
                            "----------------------------------------\n" + band_2.profil());
         
         //mengedit jumlah prsonil
         band_2.editBand(6);
         System.out.println("Setelah diubah jumlah anggota\n" + 
                            "-----------------------------\n" + band_2.profil());
 
         //mengedit status keaktifan 
         band_2.editBand(false);
         System.out.println("Setelah diubah status keaktifan\n" + 
                            "-------------------------------\n" + band_2.profil());

        /*-----------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -------------------------------------------------------------------------------------
        -----------------------------------------------------------------------------------*/

        System.out.println("======> BAND KETIGA");
        Band band_3 = new Band("Dragonforce");

        //menampilkan semua elemen profil                             
        System.out.println("Profil awal band\n" + 
                           "----------------\n" + band_3.profil());
        
        //menampilkan / mengecek status keaktifan
        System.out.println("Cek status keaktifan : " + band_3.statusKeaktifan() +"\n");

        //menampilkan / mengecek genre
        System.out.println("Cek genre : " + band_3.cekGenre() + "\n");

         //mengedit status keaktifan
         band_3.editBand(true);
         System.out.println("Setelah diubah status keaktifan\n" + 
                            "-------------------------------\n" + band_3.profil());
         
         //mengedit personil
         band_3.editBand(10);
         System.out.println("Setelah diubah jumlah anggota\n" + 
                            "-----------------------------\n" + band_3.profil());
 
         //mengedit tahun dan nama
         band_3.editBand(2003, "Heavy-Metal");
         System.out.println("Setelah diubah tahun dan genre\n" + 
                            "------------------------------\n" + band_3.profil());
                            
        printFooter();
    }

    private static void printHeader(){
        System.out.println("================================\n" +
                        "               *\n  " +
                         "           ** **\n  " +
                         "           ** **\n  " +
                         "           ** **\n  " +
                         "            ***\n   " + 
                         "           ***\n   " +
                         "           ***\n   " +
                         "   PROGRAM CEK DATA BAND\n   " +
                         "           ***\n   " +
                         "           ***\n   " +
                         "     * BETA VERSION\n   " +
                         "    * *    ***\n   " +
                         "    *  *   ***   *\n   " +
                         "    *    * ***  *  *\n   " +
                         "     *    *****    *\n   " +
                         "      *    ***    *\n    " +
                         "     *    |||    *\n   " +
                         "     *     |||     *\n   " +
                         "    *      |||      *\n   " +
                         "   *      *****      *\n   " +
                         "   *      *****      *\n   " +
                         "    *               *\n   " +
                         "      * * * * * * *\n" +
                         "================================\n"
                         );
    }
    public static void printFooter(){
        System.out.println("Terimakasih telah menggunakan program kami!\n" +
                           "     ================================");
    }
}