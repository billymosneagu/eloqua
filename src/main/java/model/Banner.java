/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Billy
 */
public class Banner {
    private String importanceFlag;
    private String text;
    private String updatedByAccount;
    private Date updatedTime;

    public Banner() {
    }

    public String getImportanceFlag() {
        return importanceFlag;
    }

    public void setImportanceFlag(String importanceFlag) {
        this.importanceFlag = importanceFlag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUpdatedByAccount() {
        return updatedByAccount;
    }

    public void setUpdatedByAccount(String updatedByAccount) {
        this.updatedByAccount = updatedByAccount;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "Banner{" + "importanceFlag=" + importanceFlag + ", text=" + text + ", updatedByAccount=" + updatedByAccount + ", updatedTime=" + updatedTime + '}';
    }
    
}
