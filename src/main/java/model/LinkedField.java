/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *Objetos que contienen un array de Links
 * @author Billy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LinkedField {
    private Link[] links;

    public LinkedField() {
    }

    public Link[] getLinks() {
        return links;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "LinkedField{" + "links=" + links + '}';
    }
    
}
