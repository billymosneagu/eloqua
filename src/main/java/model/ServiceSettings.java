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
public class ServiceSettings {
    private LinkedField answerNotifications;
    private LinkedField categoryNotifications;
    private LinkedField productNotifications;
    private LinkedField sLAInstances;

    public ServiceSettings() {
    }

    public LinkedField getAnswerNotifications() {
        return answerNotifications;
    }

    public void setAnswerNotifications(LinkedField answerNotifications) {
        this.answerNotifications = answerNotifications;
    }

    public LinkedField getCategoryNotifications() {
        return categoryNotifications;
    }

    public void setCategoryNotifications(LinkedField categoryNotifications) {
        this.categoryNotifications = categoryNotifications;
    }

    public LinkedField getProductNotifications() {
        return productNotifications;
    }

    public void setProductNotifications(LinkedField productNotifications) {
        this.productNotifications = productNotifications;
    }

    public LinkedField getsLAInstances() {
        return sLAInstances;
    }

    public void setsLAInstances(LinkedField sLAInstances) {
        this.sLAInstances = sLAInstances;
    }

    @Override
    public String toString() {
        return "ServiceSettings{" + "answerNotifications=" + answerNotifications + ", categoryNotifications=" + categoryNotifications + ", productNotifications=" + productNotifications + ", sLAInstances=" + sLAInstances + '}';
    }
    
    
}
