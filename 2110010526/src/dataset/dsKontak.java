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
public class dsKontak {
    private ArrayList<String> id;
    private ArrayList<String> nama;
    private ArrayList<String> hp;
    private ArrayList<String> email;
    private ArrayList<String> message;
    
    public dsKontak() {
        id       = new ArrayList<String>();
        nama     = new ArrayList<String>();
        hp       = new ArrayList<String>();
        email    = new ArrayList<String>();
        message  = new ArrayList<String>();
    }
     public void insertId(String isi){
        this.id.add(isi);
    }
    public ArrayList<String> getRecordId(){
        return this.id;
    }
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    public void insertHp(String isi){
        this.hp.add(isi);
    }
    public ArrayList<String> getRecordHp(){
        return this.hp;
    }
    
    public void insertEmail (String isi){
        this.email.add(isi);
    }
    public ArrayList<String> getRecordEmail (){
        return this.email ;
    }
    public void insertMessage(String isi){
        this.message.add(isi);
    }
    public ArrayList<String> getRecordMessage(){
        return this.message;
    }
   
    
    public void insertKontak(String id, String nama, String hp, String email, String message){
        this.id.add(id);
        this.nama.add(nama);
        this.hp.add(hp);
        this.email.add(email);
        this.message.add(message);
    }
}
