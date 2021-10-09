package DAO;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo2.TblChef;
import pojo2.TokoPie2Util;
import pojo2.TblPie;
import pojo2.TblTrx;

/**
 *
 * @author Zhepyrus G
 */
public class Helper {
    Session session = null;

    public Helper() {
        this.session = TokoPie2Util.getSessionFactory().getCurrentSession();
    }
    
    public List getPie() {
    List<TblPie> pielist = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from TblPie as tblpie" );
        pielist = (List<TblPie>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return pielist;
}
 public List getChef() {
    List<TblChef> cheflist = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from TblChef as tblchef" );
        cheflist = (List<TblChef>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cheflist;
 }
  public List getTrx() {
    List<TblTrx> trxlist = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from TblTrx as tbltrx" );
        trxlist = (List<TblTrx>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return trxlist;
 }
}