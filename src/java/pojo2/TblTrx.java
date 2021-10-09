package pojo2;

import DAO.DAOTrx;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TblTrx  implements java.io.Serializable {


     private Integer idTrx;
     private String namapembeli;
     private String namapie;
     private int jumlah;
     private String namachef;

    public TblTrx() {
    }

    public TblTrx(String namapembeli, String namapie, int jumlah, String namachef) {
       this.namapembeli = namapembeli;
       this.namapie = namapie;
       this.jumlah = jumlah;
       this.namachef = namachef;
    }
   
    public Integer getIdTrx() {
        return this.idTrx;
    }
    
    public void setIdTrx(Integer idTrx) {
        this.idTrx = idTrx;
    }
    public String getNamapembeli() {
        return this.namapembeli;
    }
    
    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }
    public String getNamapie() {
        return this.namapie;
    }
    
    public void setNamapie(String namapie) {
        this.namapie = namapie;
    }
    public int getJumlah() {
        return this.jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getNamachef() {
        return this.namachef;
    }
    
    public void setNamachef(String namachef) {
        this.namachef = namachef;
    }
     public void save(){
        DAOTrx plu = new DAOTrx();
        plu.addTrx(this);
        namapembeli ="";
        namachef ="";
        namapie ="";
        int jumlah;
       
      
    }
     public String getbyID(){
    DAOTrx pls = new DAOTrx();
    List<TblTrx> lPls= pls.getbyID(idTrx);
    namapembeli = lPls.get(0).namapembeli;
    namachef = lPls.get(0).namachef;
    namapie = lPls.get(0).namapie;
    jumlah = lPls.get(0).jumlah;
   
    return "edittrx";
    }
   
      




}


