/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package norhanifah_2110010526;


import klinik.*;
import dataset.*;
import form.*;

/**
 *
 * @author ACER
 */
public class Norhanifah_2110010526 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        tbl_admin admin = new tbl_admin();
        tbl_daftar daftar = new tbl_daftar();
        tbl_dokter dokter = new tbl_dokter();
        tbl_kontak kontak = new tbl_kontak();
        tbl_news news = new tbl_news();
        tbl_perawatan perawatan = new  tbl_perawatan();
        tbl_spesialis spesialis = new tbl_spesialis();

        //Set
        admin.setId("111");
        admin.setUsername("Nabila");
        admin.setPassword("000");
        admin.setLevel("1");

        daftar.setId("001");
        daftar.setSpesialis_id("A01");
        daftar.setNama_lengkap("Halimah");
        daftar.setUsia("40");
        daftar.setJenis_kelamin("Perempuan");
        daftar.setAlamat("Banjarmasin");
        daftar.setEmail("Halimah@gmail.com");
        daftar.setNo_telp("086456123452");
        daftar.setKeluhan_penyakit("Darah Tinggi");
        daftar.setTanggal("10 Juni 2023");
        daftar.setSolusi_dokter("Belum ada");
        daftar.setTanggal_solusi("5 Juni 2023");
        daftar.setStatus_daftar("Terdaftar");

        //Get
        System.out.println("id       : " + admin.getId());
        System.out.println("username : " + admin.getUsername());
        System.out.println("password : " + admin.getPassword());
        System.out.println("level    : " + admin.getLevel());
        
        System.out.println("============================================");
        System.out.println("Id :" + daftar.getId());
        System.out.println("Spesialis_id : " + daftar.getSpesialis_id());
        System.out.println("Nama : " + daftar.getNama_lengkap());
        System.out.println("Usia : " + daftar.getUsia ());
        System.out.println("Jenis Kelamin : " + daftar.getJenis_kelamin());
        System.out.println("Alamat : " + daftar.getAlamat());
        System.out.println("Email : " + daftar.getEmail());
        System.out.println("No_Telpon : " + daftar.getNo_telp());
        System.out.println("Keluhan Penyakit : " + daftar.getKeluhan_penyakit());
        System.out.println("tanggal : " + daftar.getTanggal());
        System.out.println("Solusi Dokter : " + daftar.getSolusi_dokter());
        System.out.println("Tanggal Solusi : " + daftar.getTanggal_solusi());
        System.out.println("Status : " + daftar.getStatus_daftar());
        
        dsAdmin Admin = new dsAdmin();
        dsDaftar Daftar = new dsDaftar();
        dsDokter Dokter = new dsDokter ();
        dsKontak Kontak = new dsKontak();
        dsNews News = new dsNews();
        dsPerawatan Perawatan = new dsPerawatan();
        dsSpesialis Spesialis = new dsSpesialis();
        
        //Menginput data ArrayList pada masing-masing tabel
        Admin.insertId("111");
        Admin.insertUsername("Nabila");
        Admin.insertPassword("000");
        Admin.insertLevel("1");
        
        Daftar.insertId("002");
        Daftar.insertSpesialis_id("A02");
        Daftar.insertNama_lengkap("Norhanifah ");
        Daftar.insertUsia("20");
        Daftar.insertJenis_kelamin("Perempuan");
        Daftar.insertAlamat("Banjarmasin");
        Daftar.insertEmail("norhanifah@gmail.com");
        Daftar.insertNo_telp("085321219870");
        Daftar.insertKeluhan_penyakit("Sakit Gigi");
        Daftar.insertTanggal("20-05-2023");
        Daftar.insertSolusi_dokter("Minum Obat");
        Daftar.insertTanggal_solusi("21-04-2023");
        Daftar.insertStatus_daftar("Terdaftar");
        Daftar.insertDaftar("002","A03", "Aisyah", "20", "Perempuan", "Banjarmasin",
                "aisyah@gmail.com", "087432126789", "Sakit Kepala", "25-06-2023","Minum Obat", "21-04-2023", 
                "Terdaftar" );
       
        Dokter.insertDokter_id("1111");
        Dokter.insertSpesialis_id("01");
        Dokter.insertNama_dokter("Wahyu");
        Dokter.insertEmail_dokter("wahyu@gmail.com");
        Dokter.insertPassword("0000");
        Dokter.insertShift("Malam");
        Dokter.insertDokter("1112", "02", "Muhammad Alfianor",
                "muhammadalfianor@gmail.com", "1000", "Siang");
        
        Kontak.insertId("101");
        Kontak.insertNama("Mutiara");
        Kontak.insertHp("085321675483");
        Kontak.insertEmail("mutiara@gmail.com");
        Kontak.insertMessage("Secepatnya dihubungi");
        Kontak.insertKontak("102", "Gilang Dirga","086423768854", "gilangdirga@gmail.com", "Secepatnya dihubungi");
        
        News.insertId("221");
        News.insertId_admin("1");
        News.insertJudul("Info Terbaru");
        News.insertTanggal_buat("28-05-2023");
        News.insertNews("222", "2", "Info  Terbaru", "08-05-2023");
        
        Perawatan.insertPerawatan_id("221");
        Perawatan.insertDokter_id("1");
        Perawatan.insertDetail("Info Terbaru");
        Perawatan.insertPerawatan("0", "0",  "Info Terbaru");
        
        Spesialis.insertSpesialis_id("555");
        Spesialis.insertNama_spesialis("Nisa Rahma");
        Spesialis.insertAkomodasi("Bagus");
        Spesialis.insertSpesialis("556", "Novi", "Bagus");
        
        
        //Menampilkan data ArrayList
        System.out.println("===============DATA KLINIK==============");
        System.out.println(Admin.getRecordId());
        System.out.println(Admin.getRecordUsername());
        System.out.println(Admin.getRecordPassword());
        System.out.println(Admin.getRecordLevel());
        
        System.out.println("\t");
        System.out.println("===============DATA PENDAFTAR==============");
        System.out.println(Daftar.getRecordId());
        System.out.println(Daftar.getRecordSpesialis_id());
        System.out.println(Daftar.getRecordNama_lengkap());
        System.out.println(Daftar.getRecordUsia());
        System.out.println(Daftar.getRecordJenis_kelamin());
        System.out.println(Daftar.getRecordAlamat());
        System.out.println(Daftar.getRecordEmail());
        System.out.println(Daftar.getRecordNo_telp());
        System.out.println(Daftar.getRecordKeluhan_penyakit());
        System.out.println(Daftar.getRecordTanggal());
        System.out.println(Daftar.getRecordSolusi_dokter());
        System.out.println(Daftar.getRecordTanggal_solusi());
        System.out.println(Daftar.getRecordStatus_daftar());
        
        System.out.println("\t");
        System.out.println("===============DATA DOKTER==============");
        System.out.println(Dokter.getRecordDokter_id());
        System.out.println(Dokter.getRecordSpesialis_id());
        System.out.println(Dokter.getRecordNama_dokter());
        System.out.println(Dokter.getRecordEmail_dokter());
        System.out.println(Dokter.getRecordPassword());
        System.out.println(Dokter.getRecordShift());
        
        System.out.println("\t");
        System.out.println("===============DATA KONTAK==============");
        System.out.println(Kontak.getRecordId());
        System.out.println(Kontak.getRecordNama());
        System.out.println(Kontak.getRecordHp());
        System.out.println(Kontak.getRecordEmail());
        System.out.println(Kontak.getRecordMessage());
        
        System.out.println("\t");
        System.out.println("===============DATA NEWS==============");
        System.out.println(News.getRecordId());
        System.out.println(News.getRecordId_admin());
        System.out.println(News.getRecordJudul());
        System.out.println(News.getRecordTanggal_buat());
       
        System.out.println("\t");
        System.out.println("===============DATA PERAWATAN==============");
        System.out.println(Perawatan.getRecordPerawatan_id());
        System.out.println(Perawatan.getRecordDokter_id());
        System.out.println(Perawatan.getRecordDetail());
       
        System.out.println("\t");
        System.out.println("===============DATA SPESIALIS==============");
        System.out.println(Spesialis.getRecordSpesialis_id());
        System.out.println(Spesialis.getRecordNama_spesialis());
        System.out.println(Spesialis.getRecordAkomodasi());
        
        new frameUtama().setVisible(true);
    }
}
