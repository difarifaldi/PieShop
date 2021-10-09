package pojo2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TblPie  implements java.io.Serializable {


     private String idPie;
     private String nama;
     private double harga;
     private String rasa;

    public TblPie() {
    }

    public TblPie(String idPie, String nama, double harga, String rasa) {
       this.idPie = idPie;
       this.nama = nama;
       this.harga = harga;
       this.rasa = rasa;
    }
   
    public String getIdPie() {
        return this.idPie;
    }
    
    public void setIdPie(String idPie) {
        this.idPie = idPie;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getRasa() {
        return this.rasa;
    }
    
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }




}


