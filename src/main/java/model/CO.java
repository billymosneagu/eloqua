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
public class CO {
    private String ProductoBank;
    private String reservas;

    public CO() {
    }

    public String getProductoBank() {
        return ProductoBank;
    }

    public void setProductoBank(String ProductoBank) {
        this.ProductoBank = ProductoBank;
    }

    public String getReservas() {
        return reservas;
    }

    public void setReservas(String reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "CO{" + "ProductoBank=" + ProductoBank + ", reservas=" + reservas + '}';
    }
    
    
}
