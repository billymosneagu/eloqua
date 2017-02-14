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
public class MarketingSettings {
    private LinkedField contacLists;
    private String emailFormat;
    private String marketingOptIn;
    private String marketingOrganizationName;
    private String marketingOrganizationNameAlt;
    private String surveryOptIn;

    public MarketingSettings() {
    }

    public LinkedField getContacLists() {
        return contacLists;
    }

    public void setContacLists(LinkedField contacLists) {
        this.contacLists = contacLists;
    }

    public String getEmailFormat() {
        return emailFormat;
    }

    public void setEmailFormat(String emailFormat) {
        this.emailFormat = emailFormat;
    }

    public String getMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(String marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public String getMarketingOrganizationName() {
        return marketingOrganizationName;
    }

    public void setMarketingOrganizationName(String marketingOrganizationName) {
        this.marketingOrganizationName = marketingOrganizationName;
    }

    public String getMarketingOrganizationNameAlt() {
        return marketingOrganizationNameAlt;
    }

    public void setMarketingOrganizationNameAlt(String marketingOrganizationNameAlt) {
        this.marketingOrganizationNameAlt = marketingOrganizationNameAlt;
    }

    public String getSurveryOptIn() {
        return surveryOptIn;
    }

    public void setSurveryOptIn(String surveryOptIn) {
        this.surveryOptIn = surveryOptIn;
    }

    @Override
    public String toString() {
        return "MarketingSettings{" + "contacLists=" + contacLists + ", emailFormat=" + emailFormat + ", marketingOptIn=" + marketingOptIn + ", marketingOrganizationName=" + marketingOrganizationName + ", marketingOrganizationNameAlt=" + marketingOrganizationNameAlt + ", surveryOptIn=" + surveryOptIn + '}';
    }
    
}
