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
public class CustomField {
    private CO CO;
    private C c;

    public CustomField() {
    }

    public CO getCO() {
        return CO;
    }

    public void setCO(CO CO) {
        this.CO = CO;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "CustomField{" + "CO=" + CO + ", c=" + c + '}';
    }
    
    
}
