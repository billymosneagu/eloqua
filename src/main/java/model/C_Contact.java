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
public class C_Contact {
    private String type;
    private String contactId;
    private String C_EmailAddress;
    private String C_FirstName;
    private String C_LastName;
    private String C_Title;
    private String C_Company;
    private String C_BusPhone;
    private String C_Address1;
    private String C_City;
    private String C_Salesperson;
    private String C_Informacion_de_ofertas;
    private String C_Twitter_Id1;
    private String C_Facebook_Id1;
    private String currentStatus;
    

    public C_Contact() {
    }

    public String getC_EmailAddress() {
        return C_EmailAddress;
    }

    public void setC_EmailAddress(String C_EmailAddress) {
        this.C_EmailAddress = C_EmailAddress;
    }

    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getC_EmailAdress() {
        return C_EmailAddress;
    }

    public void setC_EmailAdress(String C_EmailAdress) {
        this.C_EmailAddress = C_EmailAdress;
    }

    public String getC_FirstName() {
        return C_FirstName;
    }

    public void setC_FirstName(String C_FirstName) {
        this.C_FirstName = C_FirstName;
    }

    public String getC_LastName() {
        return C_LastName;
    }

    public void setC_LastName(String C_LastName) {
        this.C_LastName = C_LastName;
    }

    public String getC_Title() {
        return C_Title;
    }

    public void setC_Title(String C_Title) {
        this.C_Title = C_Title;
    }

    public String getC_Company() {
        return C_Company;
    }

    public void setC_Company(String C_Company) {
        this.C_Company = C_Company;
    }

    public String getC_BusPhone() {
        return C_BusPhone;
    }

    public void setC_BusPhone(String C_BusPhone) {
        this.C_BusPhone = C_BusPhone;
    }

    public String getC_Address1() {
        return C_Address1;
    }

    public void setC_Address1(String C_Address1) {
        this.C_Address1 = C_Address1;
    }

    public String getC_City() {
        return C_City;
    }

    public void setC_City(String C_City) {
        this.C_City = C_City;
    }

    public String getC_Salesperson() {
        return C_Salesperson;
    }

    public void setC_Salesperson(String C_Salesperson) {
        this.C_Salesperson = C_Salesperson;
    }

    public String getC_Informacion_de_ofertas() {
        return C_Informacion_de_ofertas;
    }

    public void setC_Informacion_de_ofertas(String C_Informacion_de_ofertas) {
        this.C_Informacion_de_ofertas = C_Informacion_de_ofertas;
    }

    public String getC_Twitter_Id1() {
        return C_Twitter_Id1;
    }

    public void setC_Twitter_Id1(String C_Twitter_Id1) {
        this.C_Twitter_Id1 = C_Twitter_Id1;
    }

    public String getC_Facebook_Id1() {
        return C_Facebook_Id1;
    }

    public void setC_Facebook_Id1(String C_Facebook_Id1) {
        this.C_Facebook_Id1 = C_Facebook_Id1;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "C_Contact{" + "type=" + type + ", contactId=" + contactId + ", C_EmailAddress=" + C_EmailAddress + ", C_FirstName=" + C_FirstName + ", C_LastName=" + C_LastName + ", C_Title=" + C_Title + ", C_Company=" + C_Company + ", C_BusPhone=" + C_BusPhone + ", C_Address1=" + C_Address1 + ", C_City=" + C_City + ", C_Salesperson=" + C_Salesperson + ", C_Informacion_de_ofertas=" + C_Informacion_de_ofertas + ", C_Twitter_Id1=" + C_Twitter_Id1 + ", C_Facebook_Id1=" + C_Facebook_Id1 + ", currentStatus=" + currentStatus + '}';
    }

    

    
    
}
