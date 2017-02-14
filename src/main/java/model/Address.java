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
public class Address {
   private String city;
   private LinkedField country;
   private String postalCode;
   private String stateOrProvince;
   private String street;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LinkedField getCountry() {
        return country;
    }

    public void setCountry(LinkedField country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return stateOrProvince;
    }

    public void setState(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", country=" + country + ", postalCode=" + postalCode + ", stateOrProvince=" +stateOrProvince+ ", street=" + street + '}';
    }
   
           
    
    
}
