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
public class dsPerawatan {
    private ArrayList<String> perawatan_id;
    private ArrayList<String> dokter_id;
    private ArrayList<String> detail;
    
    public dsPerawatan() {
        perawatan_id  = new ArrayList<String>();
        dokter_id     = new ArrayList<String>();
        detail        = new ArrayList<String>();
    }
     public void insertPerawatan_id(String isi){
        this.perawatan_id.add(isi);
    }
    public ArrayList<String> getRecordPerawatan_id(){
        return this.perawatan_id;
    }
    public void insertDokter_id(String isi){
        this.dokter_id.add(isi);
    }
    public ArrayList<String> getRecordDokter_id(){
        return this.dokter_id;
    }
    
    public void insertDetail(String isi){
        this.detail.add(isi);
    }
    public ArrayList<String> getRecordDetail(){
        return this.detail;
    }
   
    
    public void insertPerawatan(String perawatan_id, String dokter_id, String detail){
        this.perawatan_id.add(perawatan_id);
        this.dokter_id.add(dokter_id);
        this.detail.add(detail);
    }
}
