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
public class Source {
    private int id;
    private String lookupName;
    private Parent[] parents;

    public Source() {
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

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Source{" + "id=" + id + ", lookupName=" + lookupName + ", parents=" + parents + '}';
    }
    
}
