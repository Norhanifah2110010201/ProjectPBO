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
public class dsNews {
    private ArrayList<String> id;
    private ArrayList<String> id_admin;
    private ArrayList<String> judul;
    private ArrayList<String> tanggal_buat;
    
    public dsNews() {
        id            = new ArrayList<String>();
        id_admin      = new ArrayList<String>();
        judul         = new ArrayList<String>();
        tanggal_buat  = new ArrayList<String>();
    }
     public void insertId(String isi){
        this.id.add(isi);
    }
    public ArrayList<String> getRecordId(){
        return this.id;
    }
    
    public void insertId_admin(String isi){
        this.id_admin.add(isi);
    }
    public ArrayList<String> getRecordId_admin(){
        return this.id_admin;
    }
    
    public void insertJudul(String isi){
        this.judul.add(isi);
    }
    public ArrayList<String> getRecordJudul(){
        return this.judul;
    }
    
    public void insertTanggal_buat (String isi){
        this.tanggal_buat.add(isi);
    }
    public ArrayList<String> getRecordTanggal_buat (){
        return this.tanggal_buat ;
    }
   
    
    public void insertNews(String id, String id_admin, String judul, String tanggal_buat){
        this.id.add(id);
        this.id_admin.add(id_admin);
        this.judul.add(judul);
        this.tanggal_buat.add(tanggal_buat);
    }
}
