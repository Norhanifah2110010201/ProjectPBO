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
public class dsAdmin {
    private ArrayList<String> id;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> level;
    
    public dsAdmin() {
        id       = new ArrayList<String>();
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        level    = new ArrayList<String>();
    }
     public void insertId(String isi){
        this.id.add(isi);
    }
    public ArrayList<String> getRecordId(){
        return this.id;
    }
    
    public void insertUsername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.username;
    }
    
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordPassword(){
        return this.password;
    }
    
    public void insertLevel (String isi){
        this.level .add(isi);
    }
    public ArrayList<String> getRecordLevel (){
        return this.level ;
    }
   
    
    public void insertAdmin(String id, String username, String password, String level){
        this.id.add(id);
        this.username.add(username);
        this.password.add(password);
        this.level.add(level);
    }
}
