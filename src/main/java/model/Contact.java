/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Billy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact 
{       
        
	public String accountName;
	public String address1;
	public String address2;
	public String address3;
	public String businessPhone;
	public String city;
	public String country;
	public String firstName;
	public String emailAddress;
	public int id;	
	public boolean isBounceback;
	public boolean isSubscribed;
	public String lastName;
	public String salesPerson;
	public String title;
	public List<FieldValue> fieldValues;

    @Override
    public String toString() {
        return "Contact{" + "accountName=" + accountName + ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", businessPhone=" + businessPhone + ", city=" + city + ", country=" + country + ", firstName=" + firstName + ", emailAddress=" + emailAddress + ", isBounceback=" + isBounceback + ", isSubscribed=" + isSubscribed + ", lastName=" + lastName + ", salesPerson=" + salesPerson + ", title=" + title + ", fieldValues=" + fieldValues + '}';
    }

   

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsBounceback() {
        return isBounceback;
    }

    public void setIsBounceback(boolean isBounceback) {
        this.isBounceback = isBounceback;
    }

    public boolean isIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FieldValue> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(List<FieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }
        
}
