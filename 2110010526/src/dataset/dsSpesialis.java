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
public class dsSpesialis {
    private ArrayList<String> spesialis_id;
    private ArrayList<String> nama_spesialis;
    private ArrayList<String> akomodasi;
    
    public dsSpesialis() {
        spesialis_id    = new ArrayList<String>();
        nama_spesialis  = new ArrayList<String>();
        akomodasi       = new ArrayList<String>();
    }
     public void insertSpesialis_id(String isi){
        this.spesialis_id.add(isi);
    }
    public ArrayList<String> getRecordSpesialis_id(){
        return this.spesialis_id;
    }
    public void insertNama_spesialis(String isi){
        this.nama_spesialis.add(isi);
    }
    public ArrayList<String> getRecordNama_spesialis(){
        return this.nama_spesialis;
    }
    
    public void insertAkomodasi(String isi){
        this.akomodasi.add(isi);
    }
    public ArrayList<String> getRecordAkomodasi(){
        return this.akomodasi;
    }
   
    
    public void insertSpesialis(String spesialis_id, String nama_spesialis, String akomodasi){
        this.spesialis_id.add(spesialis_id);
        this.nama_spesialis.add(nama_spesialis);
        this.akomodasi.add(akomodasi);
    }
}
