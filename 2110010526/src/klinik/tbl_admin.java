/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

/**
 *
 * @author ACER
 */
public class tbl_admin {
    private String id;
    private String username;
    private String password;
    private String level;
    
    public tbl_admin(){}
    
    public void setId (String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setUsername (String username){
        this.username=username;
    }
    public String getUsername(){
        return this.username;
    }
     public void setPassword (String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setLevel (String level){
        this.level=level;
    }
    public String getLevel(){
        return this.level;
    }
}
