/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_dokter {
    private String dokter_id;
    private String spesialis_id;
    private String nama_dokter;
    private String email_dokter;
    private String password;
    private String shift;
    
    public tbl_dokter(){}
    
    public void setDokter_id (String dokter_id){
        this.dokter_id=dokter_id;
    }
    public String getDokter_id(){
        return this.dokter_id;
    }
    public void setSpesialis_id (String spesialis_id){
        this.spesialis_id=spesialis_id;
    }
    public String getSpesialis_id(){
        return this.spesialis_id;
    }
     public void setNama_dokter (String nama_dokter){
        this.nama_dokter=nama_dokter;
    }
    public String getNama_dokter(){
        return this.nama_dokter;
    }
    public void setEmail_dokter (String email_dokter){
        this.email_dokter=email_dokter;
    }
    public String getEmail_dokter(){
        return this.email_dokter;
    }
     public void setPassword (String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setShift (String shift){
        this.shift=shift;
    }
    public String getShift(){
        return this.shift;
    }
    
}
