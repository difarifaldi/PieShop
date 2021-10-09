/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Difarifaldi
 */
@ManagedBean
public class DAOAdmin {
    private String UNAME;
    private String PASS;

    /**
     * @return the UNAME
     */
    public String getUNAME() {
        return UNAME;
    }

    /**
     * @param UNAME the UNAME to set
     */
    public void setUNAME(String UNAME) {
        this.UNAME = UNAME;
    }

    /**
     * @return the PASS
     */
    public String getPASS() {
        return PASS;
    }

    /**
     * @param PASS the PASS to set
     */
    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
    public String login1(){
        if(UNAME.equals("admin")&&PASS.equals("admin")){
            return "indextrx";
        }else{
            return "index";
    }
    
    
}
}
