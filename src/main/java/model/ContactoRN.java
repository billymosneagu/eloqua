/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Billy
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactoRN {
    private int id;
    private String lookupName;
    private Date createdTime;
    private Date updatedTime;
    private Address address;
    private Banner banner;
    private LinkedField channelUsernames;
    private String contactType;
    private CRMModules cRMModules;
    private CustomField customFields;
    private boolean disabled;
    private LinkedField emails;
    private String externalReference;
    private LinkedField fileAttachments;
    private String login;
    private Name name;
    private Name nameFurigana;
    private LinkedField notes;
    private LinkedField openIDAccounts;
    private String organization;
    private String passwordEmailExpirationTime;
    private String passwordExpirationTime;
    private LinkedField phones;
    private Source source;
    private String title;
    private Link[] links;
    private String email;

    public ContactoRN() {
    }

    public LinkedField getOpenIDAccounts() {
        return openIDAccounts;
    }

    public void setOpenIDAccounts(LinkedField openIDAccounts) {
        this.openIDAccounts = openIDAccounts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public LinkedField getChannelUsernames() {
        return channelUsernames;
    }

    public void setChannelUsernames(LinkedField channelUsernames) {
        this.channelUsernames = channelUsernames;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public CRMModules getcRMModules() {
        return cRMModules;
    }

    public void setcRMModules(CRMModules cRMModules) {
        this.cRMModules = cRMModules;
    }

    public CustomField getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomField customFields) {
        this.customFields = customFields;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public LinkedField getEmails() {
        return emails;
    }

    public void setEmails(LinkedField emails) {
        this.emails = emails;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public LinkedField getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(LinkedField fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getNameFurigana() {
        return nameFurigana;
    }

    public void setNameFurigana(Name nameFurigana) {
        this.nameFurigana = nameFurigana;
    }

    public LinkedField getNotes() {
        return notes;
    }

    public void setNotes(LinkedField notes) {
        this.notes = notes;
    }

    public LinkedField getOpenIDAccount() {
        return openIDAccounts;
    }

    public void setOpenIDAccount(LinkedField openIDAccount) {
        this.openIDAccounts = openIDAccount;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    public void setPasswordEmailExpirationTime(String passwordEmailExpirationTime) {
        this.passwordEmailExpirationTime = passwordEmailExpirationTime;
    }

    public String getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    public void setPasswordExpirationTime(String passwordExpirationTime) {
        this.passwordExpirationTime = passwordExpirationTime;
    }

    public LinkedField getPhones() {
        return phones;
    }

    public void setPhones(LinkedField phones) {
        this.phones = phones;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Link[] getLinks() {
        return links;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "ContactoRN{" + "id=" + id + ", lookupName=" + lookupName + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", address=" + address + ", banner=" + banner + ", channelUsernames=" + channelUsernames + ", contactType=" + contactType + ", cRMModules=" + cRMModules + ", customFields=" + customFields + ", disabled=" + disabled + ", emails=" + emails + ", externalReference=" + externalReference + ", fileAttachments=" + fileAttachments + ", login=" + login + ", name=" + name + ", nameFurigana=" + nameFurigana + ", notes=" + notes + ", openIDAccount=" + openIDAccounts + ", organization=" + organization + ", passwordEmailExpirationTime=" + passwordEmailExpirationTime + ", passwordExpirationTime=" + passwordExpirationTime + ", phones=" + phones + ", source=" + source + ", title=" + title + ", links=" + links + '}';
    }
    
    
}
