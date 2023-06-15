/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_spesialis {
    private String spesialis_id;
    private String nama_spesialis;
    private String akomodasi;
    
    public tbl_spesialis(){}
    
    public void setSpesialis_id (String spesialis_id){
        this.spesialis_id=spesialis_id;
    }
    public String getSpesialis_id(){
        return this.spesialis_id;
    }
    public void setNama_spesialis (String nama_spesialis){
        this.nama_spesialis=nama_spesialis;
    }
    public String getNama_spesialis(){
        return this.nama_spesialis;
    }
     public void setAkomodasi (String akomodasi){
        this.akomodasi=akomodasi;
    }
    public String getAkomodasi(){
        return this.akomodasi;
    }
    
}
