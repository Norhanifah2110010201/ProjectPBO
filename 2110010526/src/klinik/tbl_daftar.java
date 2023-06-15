/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_daftar {
    private String id;
    private String spesialis_id;
    private String nama_lengkap;
    private String usia;
    private String jenis_kelamin;
    private String alamat;
    private String email;
    private String no_telp;
    private String keluhan_penyakit;
    private String tanggal;
    private String solusi_dokter;
    private String tanggal_solusi;
    private String status_daftar;
    
    public tbl_daftar(){}
    
    public void setId (String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setSpesialis_id (String spesialis_id){
        this.spesialis_id=spesialis_id;
    }
    public String getSpesialis_id(){
        return this.spesialis_id;
    }
     public void setNama_lengkap (String nama_lengkap){
        this.nama_lengkap=nama_lengkap;
    }
    public String getNama_lengkap(){
        return this.nama_lengkap;
    }
    public void setUsia (String usia){
        this.usia=usia;
    }
    public String getUsia(){
        return this.usia;
    }
     public void setJenis_kelamin (String jenis_kelamin){
        this.jenis_kelamin=jenis_kelamin;
    }
    public String getJenis_kelamin(){
        return this.jenis_kelamin;
    }
    public void setAlamat (String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setEmail (String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
     public void setNo_telp (String no_telp){
        this.no_telp=no_telp;
    }
    public String getNo_telp(){
        return this.no_telp;
    }
    public void setKeluhan_penyakit (String keluhan_penyakit){
        this.keluhan_penyakit=keluhan_penyakit;
    }
    public String getKeluhan_penyakit(){
        return this.keluhan_penyakit;
    }
     public void setTanggal (String tanggal){
        this.tanggal=tanggal;
    }
    public String getTanggal(){
        return this.tanggal;
    }
    public void setSolusi_dokter (String solusi_dokter){
        this.solusi_dokter=solusi_dokter;
    }
    public String getSolusi_dokter(){
        return this.solusi_dokter;
    }
    public void setTanggal_solusi (String tanggal_solusi){
        this.tanggal_solusi=tanggal_solusi;
    }
    public String getTanggal_solusi(){
        return this.tanggal_solusi;
    }
     public void setStatus_daftar (String status_daftar){
        this.status_daftar=status_daftar;
    }
    public String getStatus_daftar(){
        return this.status_daftar;
    }
    
}
