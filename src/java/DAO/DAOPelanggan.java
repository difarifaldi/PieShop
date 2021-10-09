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
public class DAOPelanggan {
    public List<TblPelanggan> getbyUsername(String idP){
        TblPelanggan pls = new TblPelanggan();
        List<TblPelanggan> lPls = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoPie2Util.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = 
            session.createQuery("from TblPelanggan where username= :username");
            query.setString("username", idP);
            pls = (TblPelanggan) query.uniqueResult();
            lPls = query.list();
            trans.commit();
        }catch (Exception e){        
        }
        return lPls;
        }
     
   public void updatePelanggan(TblPelanggan pls){
        Transaction trans =null;
        Session session =TokoPie2Util.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(pls);
            trans.commit();
        }catch(Exception e){
            
        }
    
    }
    public void deletePelanggan(String nP){
        Transaction trans = null;
        Session session = TokoPie2Util.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            TblPelanggan pls =
            (TblPelanggan) session.load(TblPelanggan.class, new String (nP));
            session.delete(pls);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    
}
    
}
