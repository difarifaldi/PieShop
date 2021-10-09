/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Zhepyrus G
 */
@Named(value = "dataController2")
@SessionScoped
public class DataController2 implements Serializable {
 Helper helper;
     DataModel alltrx;
    /**
     * Creates a new instance of BarangController
     */


   public DataModel getTrx() {
        if (alltrx == null) {
            alltrx = new ListDataModel(helper.getTrx());
        }
        return alltrx;
    }

    void recreateModel() {
        alltrx = null;
    }
    
    /**
     * Creates a new instance of DataController
     */
    public DataController2() {
                    helper = new Helper();

    }
    
}
