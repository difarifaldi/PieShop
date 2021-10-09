/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo2.TblPelanggan;
import pojo2.TokoPie2Util;

/**
 *
 * @author Difarifaldi
 */
public class DAOLogin {
    public List<TblPelanggan> getBy(String uName,String uPass){
        TblPelanggan u = new TblPelanggan();
        List<TblPelanggan> user = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoPie2Util.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblPelanggan where username="
                    + " :uName AND password= :uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            u = (TblPelanggan) query.uniqueResult();
            user = query.list();
            
            trans.commit();
        }catch(Exception e) {
            System.out.println("Error"+ e);
    }
        return user;
        
    }
    public void addPelanggan(TblPelanggan plu){
        Transaction trans = null;
        Session session = TokoPie2Util.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(plu);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     public List<TblPelanggan> retrieveTblPelanggan(){
        List stud = new ArrayList();
        TblPelanggan stud1 = new TblPelanggan();
        Transaction trans =null;
        Session session =TokoPie2Util.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query=
            session.createQuery("from TblPelanggan");
            stud = query.list();
            stud.add(stud1.getNama());
            stud.add(stud1.getAlamat());
            stud.add(stud1.getEmail());
            stud.add(stud1.getNoHp());
            trans.commit();
        }catch(Exception e){
            
        }
        return stud;
    }
    
}
