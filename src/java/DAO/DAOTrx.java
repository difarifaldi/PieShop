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
import pojo2.TblTrx;
import pojo2.TokoPie2Util;

/**
 *
 * @author Difarifaldi
 */
public class DAOTrx {
     public void addTrx(TblTrx plu){
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
      public List<TblTrx> getbyID(Integer idP){
        TblTrx pls = new  TblTrx();
        List< TblTrx> lPls = new ArrayList();
        
        Transaction trans = null;
        Session session = TokoPie2Util.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = 
            session.createQuery("from TblTrx where idTrx= :idTrx");
            query.setInteger("idTrx", idP);
            pls = (TblTrx) query.uniqueResult();
            lPls = query.list();
            trans.commit();
        }catch (Exception e){        
        }
        return lPls;
        }

   

    
}
