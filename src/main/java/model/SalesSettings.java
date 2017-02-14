/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Billy
 */
public class SalesSettings {
    private String acquiredDate;
    private LinkedField links;

    public SalesSettings() {
    }

    public String getAcquiredDate() {
        return acquiredDate;
    }

    public void setAcquiredDate(String acquiredDate) {
        this.acquiredDate = acquiredDate;
    }

    public LinkedField getLinks() {
        return links;
    }

    public void setLinks(LinkedField links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "SalesSettings{" + "acquiredDate=" + acquiredDate + ", links=" + links + '}';
    }
    
}
