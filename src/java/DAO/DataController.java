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
@Named(value = "dataController")
@SessionScoped
public class DataController implements Serializable {
 Helper helper;
     DataModel allpie;
    /**
     * Creates a new instance of BarangController
     */


   public DataModel getPie() {
        if (allpie == null) {
            allpie = new ListDataModel(helper.getPie());
        }
        return allpie;
    }

    void recreateModel() {
        allpie = null;
    }
    
    /**
     * Creates a new instance of DataController
     */
    public DataController() {
                    helper = new Helper();

    }
    
}
