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
public class Tipocomentario {
    private int id;
    private String lookupName;

    public Tipocomentario() {
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
        return "Tipocomentario{" + "id=" + id + ", lookupName=" + lookupName + '}';
    }
    
    
}
