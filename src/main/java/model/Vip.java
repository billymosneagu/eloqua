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
public class Vip {
 private int id;
 private String lookupName;

    public Vip() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    @Override
    public String toString() {
        return "Vip{" + "id=" + id + ", lookupName=" + lookupName + '}';
    }
 
}
