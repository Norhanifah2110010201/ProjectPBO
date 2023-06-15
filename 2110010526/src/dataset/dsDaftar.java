/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author mzenm
 */
public class dsDaftar {
    
    private ArrayList<String> id;
    private ArrayList<String> spesialis_id;
    private ArrayList<String> nama_lengkap;
    private ArrayList<String> usia;
    private ArrayList<String> jenis_kelamin;
    private ArrayList<String> alamat;
    private ArrayList<String> email;
    private ArrayList<String> no_telp;
    private ArrayList<String> keluhan_penyakit;
    private ArrayList<String> tanggal;
    private ArrayList<String> solusi_dokter;
    private ArrayList<String> tanggal_solusi;
    private ArrayList<String> status_daftar;
    
    public dsDaftar(){
        id                  = new ArrayList<String>();
        spesialis_id       = new ArrayList<String>();
        nama_lengkap       = new ArrayList<String>();
        usia               = new ArrayList<String>();
        jenis_kelamin      = new ArrayList<String>();
        alamat             = new ArrayList<String>();
        email              = new ArrayList<String>();
        no_telp            = new ArrayList<String>();
        keluhan_penyakit   = new ArrayList<String>();
        tanggal            = new ArrayList<String>();
        solusi_dokter      = new ArrayList<String>();
        tanggal_solusi     = new ArrayList<String>();
        status_daftar      = new ArrayList<String>();
    }
    
    public void insertId(String isi){
        this.id.add(isi);
    }
    
     public ArrayList<String> getRecordId(){
        return this.id;
    }
    
    public void insertSpesialis_id(String isi){
        this.spesialis_id.add(isi);
    }
    public ArrayList<String> getRecordSpesialis_id(){
        return this.spesialis_id;
    }
    
    public void insertNama_lengkap(String isi){
        this.nama_lengkap.add(isi);
    }
    public ArrayList<String> getRecordNama_lengkap(){
        return this.nama_lengkap;
    }
    
    public void insertUsia (String isi){
        this.usia .add(isi);
    }
    public ArrayList<String> getRecordUsia (){
        return this.usia ;
    }
     public void insertJenis_kelamin (String isi){
        this.jenis_kelamin .add(isi);
    }
    public ArrayList<String> getRecordJenis_kelamin(){
        return this.jenis_kelamin ;
    }
     public void insertAlamat (String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat (){
        return this.alamat ;
    }
     public void insertEmail (String isi){
        this.email.add(isi);
    }
    public ArrayList<String> getRecordEmail (){
        return this.email ;
    }
     public void insertNo_telp (String isi){
        this.no_telp .add(isi);
    }
    public ArrayList<String> getRecordNo_telp (){
        return this.no_telp ;
    }
     public void insertKeluhan_penyakit (String isi){
        this.keluhan_penyakit .add(isi);
    }
    public ArrayList<String> getRecordKeluhan_penyakit(){
        return this.keluhan_penyakit ;
    }
     public void insertTanggal  (String isi){
        this.tanggal  .add(isi);
    }
    public ArrayList<String> getRecordTanggal (){
        return this.tanggal  ;
    }
     public void insertSolusi_dokter  (String isi){
        this.solusi_dokter  .add(isi);
    }
    public ArrayList<String> getRecordSolusi_dokter (){
        return this.solusi_dokter  ;
    }
     public void insertTanggal_solusi (String isi){
        this.tanggal_solusi .add(isi);
    }
    public ArrayList<String> getRecordTanggal_solusi(){
        return this.tanggal_solusi ;
    }
    public void insertStatus_daftar (String isi){
        this.status_daftar .add(isi);
    }
    public ArrayList<String> getRecordStatus_daftar(){
        return this.status_daftar ;
    }
   
    
    public void insertDaftar(String id, String spesialis_id, String nama_lengkap, String usia, String jenis_kelamin,
            String alamat, String email, String no_telp, String keluhan_penyakit, String tanggal, String solusi_dokter,
            String tanggal_solusi, String status_daftar){
        this.id.add(id);
        this.spesialis_id.add(spesialis_id);
        this.nama_lengkap.add(nama_lengkap);
        this.usia.add(usia);
        this.jenis_kelamin.add(jenis_kelamin);
        this.alamat.add(alamat);
        this.email.add(email);
        this.no_telp.add(no_telp);
        this.keluhan_penyakit.add(keluhan_penyakit);
        this.tanggal.add(tanggal);
        this.solusi_dokter.add(solusi_dokter);
        this.tanggal_solusi.add(tanggal_solusi);
        this.status_daftar.add(status_daftar);
        
    }
}
