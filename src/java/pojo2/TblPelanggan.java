package pojo2;
// Generated Oct 19, 2020 4:38:15 PM by Hibernate Tools 4.3.1

import DAO.DAOLogin;
import DAO.DAOPelanggan;
import java.util.List;
import javax.faces.bean.ManagedBean;




@ManagedBean
public class TblPelanggan  implements java.io.Serializable {


     private String username;
     private String password;
     private String nama;
     private String alamat;
     private String email;
     private String noHp;

    public TblPelanggan() {
    }

    public TblPelanggan(String username, String password, String nama, String alamat, String email, String noHp) {
       this.username = username;
       this.password = password;
       this.nama = nama;
       this.alamat = alamat;
       this.email = email;
       this.noHp = noHp;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNoHp() {
        return this.noHp;
    }
    
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
     public String validasiLogin(){
    DAOLogin dao =new DAOLogin();
    List<TblPelanggan> us = dao.getBy(username,password);
    if (us != null){
    username = us.get(0).username;
    password = us.get(0).password;
    nama = us.get(0).nama;
    alamat = us.get(0).alamat;
    email = us.get(0).email;
    noHp = us.get(0).noHp;
    
    return "Home";

}
    
    return "index";
}
     public void save(){
        DAOLogin plu = new DAOLogin();
        plu.addPelanggan(this);
        username ="";
        password ="";
        nama ="";
        alamat ="";
        email ="";
        noHp ="";
    }
      public List<TblPelanggan> getallrecords(){
          DAOLogin pls = new DAOLogin();
        List<TblPelanggan> LPls = pls.retrieveTblPelanggan();
        
        
        return LPls;
    }
      public String getbyUsername(){
    DAOPelanggan pls = new DAOPelanggan();
    List<TblPelanggan> lPls= pls.getbyUsername(username);
    password = lPls.get(0).password;
    nama = lPls.get(0).nama;
    alamat = lPls.get(0).alamat;
    email = lPls.get(0).email;
    noHp = lPls.get(0).noHp;
    return "profil";
    }
      public void deletePelanggan(){
        DAOPelanggan pls = new DAOPelanggan();
        pls.deletePelanggan(username);
         username="";
        password="";
        nama ="";
        alamat ="";
        email ="";
        noHp="";
        
        
    }
      public void updatePelanggan(){
         DAOPelanggan pls = new DAOPelanggan();
        pls.updatePelanggan(this);
         username="";
        password="";
        nama ="";
        alamat ="";
        email ="";
        noHp="";
        
       
      }




}


