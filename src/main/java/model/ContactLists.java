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
public class ContactLists {
    private Link[] links;

    public ContactLists() {
    }

    public Link[] getLinks() {
        return links;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "ContactLists{" + "links=" + links + '}';
    }
    
}
