/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Billy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CRMModules {
    private boolean marketing;
    private boolean sales;
    private boolean service;

    public CRMModules() {
    }

    public boolean isMarketing() {
        return marketing;
    }

    public void setMarketing(boolean marketing) {
        this.marketing = marketing;
    }

    public boolean isSales() {
        return sales;
    }

    public void setSales(boolean sales) {
        this.sales = sales;
    }

    public boolean isServices() {
        return service;
    }

    public void setServices(boolean services) {
        this.service = services;
    }

    @Override
    public String toString() {
        return "CRMModules{" + "marketing=" + marketing + ", sales=" + sales + ", service=" + service + '}';
    }
    
}
