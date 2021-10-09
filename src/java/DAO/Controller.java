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
@Named(value = "Controller")
@SessionScoped
public class Controller implements Serializable {
 Helper helper;
     DataModel allchef;
    /**
     * Creates a new instance of BarangController
     */


   public DataModel getChef() {
        if (allchef == null) {
            allchef = new ListDataModel(helper.getChef());
        }
        return allchef;
    }

    void recreateModel() {
        allchef = null;
    }
    
    /**
     * Creates a new instance of DataController
     */
    public Controller() {
                    helper = new Helper();

    }
    
}
