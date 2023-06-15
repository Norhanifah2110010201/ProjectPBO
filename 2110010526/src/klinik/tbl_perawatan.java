/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_perawatan {
    private String perawatan_id;
    private String dokter_id;
    private String detail;
    
    public tbl_perawatan(){}
    
    public void setPerawatan_id (String perawatan_id){
        this.perawatan_id=perawatan_id;
    }
    public String getPerawatan_id(){
        return this.perawatan_id;
    }
    public void setDokter_id (String dokter_id){
        this.dokter_id=dokter_id;
    }
    public String getDokter_id(){
        return this.dokter_id;
    }
     public void setDetail (String detail){
        this.detail=detail;
    }
    public String getDetail(){
        return this.detail;
    }
    
}
