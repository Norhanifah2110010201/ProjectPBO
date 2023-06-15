/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_kontak {
    private String id;
    private String nama;
    private String hp;
    private String email;
    private String message;
    
    public tbl_kontak(){}
    
    public void setId (String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setNama (String nama){
        this.nama=nama;
    }
    public String getNama(){
        return this.nama;
    }
     public void setHp (String hp){
        this.hp=hp;
    }
    public String getHp(){
        return this.hp;
    }
    public void setEmail (String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
     public void setMessage (String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
    
}
