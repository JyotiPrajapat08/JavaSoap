/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author ASUS
 */
public class BakedGoods {
      private int bakeid;
    private String bakename;
    private Double bakeprice;

    public BakedGoods(int bakeid, String bakename, Double bakeprice) {
        this.bakeid = bakeid;
        this.bakename = bakename;
        this.bakeprice = bakeprice;
    }
public BakedGoods(){
    
}
    /**
     * @return the bakeid
     */
    public int getBakeid() {
        return bakeid;
    }

    /**
     * @param bakeid the bakeid to set
     */
    public void setBakeid(int bakeid) {
        this.bakeid = bakeid;
    }

    /**
     * @return the bakename
     */
    public String getBakename() {
        return bakename;
    }

    /**
     * @param bakename the bakename to set
     */
    public void setBakename(String bakename) {
        this.bakename = bakename;
    }

    /**
     * @return the bakeprice
     */
    public Double getBakeprice() {
        return bakeprice;
    }

    /**
     * @param bakeprice the bakeprice to set
     */
    public void setBakeprice(Double bakeprice) {
        this.bakeprice = bakeprice;
    }

}
