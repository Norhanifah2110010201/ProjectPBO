/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_news {
    private String id;
    private String id_admin;
    private String judul;
    private String content;
    private String tgl_buat;
    
    public tbl_news(){}
    
    public void setId (String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setId_admin (String id_admin){
        this.id_admin=id_admin;
    }
    public String getId_admin(){
        return this.id_admin;
    }
     public void setjudul (String judul){
        this.judul=judul;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setContent (String content){
        this.content=content;
    }
    public String getContent(){
        return this.content;
    }
     public void setTgl_buat (String tgl_buat){
        this.tgl_buat=tgl_buat;
    }
    public String getTgl_buat(){
        return this.tgl_buat;
    }
}
