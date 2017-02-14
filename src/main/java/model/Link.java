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
public class Link {
    private String rel;
    private String href;
    private String mediaType;

    public Link() {
    }
    
    
    
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Link{" + "rel=" + rel + ", href=" + href + '}';
    }
    
}
