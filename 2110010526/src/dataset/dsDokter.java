/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class dsDokter {
    private ArrayList<String> dokter_id;
    private ArrayList<String> spesialis_id;
    private ArrayList<String> nama_dokter;
    private ArrayList<String> email_dokter;
    private ArrayList<String> password;
    private ArrayList<String> shift;
    
    public dsDokter() {
        dokter_id       = new ArrayList<String>();
        spesialis_id    = new ArrayList<String>();
        nama_dokter     = new ArrayList<String>();
        email_dokter    = new ArrayList<String>();
        password        = new ArrayList<String>();
        shift           = new ArrayList<String>();
    }
     public void insertDokter_id(String isi){
        this.dokter_id.add(isi);
    }
    public ArrayList<String> getRecordDokter_id(){
        return this.dokter_id;
    }
    
    public void insertSpesialis_id(String isi){
        this.spesialis_id.add(isi);
    }
    public ArrayList<String> getRecordSpesialis_id(){
        return this.spesialis_id;
    }
    
    public void insertNama_dokter(String isi){
        this.nama_dokter.add(isi);
    }
    public ArrayList<String> getRecordNama_dokter(){
        return this.nama_dokter;
    }
    
    public void insertEmail_dokter (String isi){
        this.email_dokter.add(isi);
    }
    public ArrayList<String> getRecordEmail_dokter (){
        return this.email_dokter ;
    }
     public void insertPassword (String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordPassword (){
        return this.password;
    }
     public void insertShift  (String isi){
        this.shift .add(isi);
    }
    public ArrayList<String> getRecordShift  (){
        return this.shift ;
    }
   
    
    public void insertDokter(String dokter_id, String spesialis_id, String nama_dokter,
            String email_dokter, String password, String shift){
        this.dokter_id  .add(dokter_id);
        this.spesialis_id.add(spesialis_id);
        this.nama_dokter.add(nama_dokter);
        this.email_dokter.add(email_dokter);
        this.password  .add(password);
        this.shift.add(shift);
    }
}
