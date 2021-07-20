/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author user
 */
public class Order {
    private int id;
    private String name;
    private String date_order;
    private int idProduct;
    private Product product;

    
    public Order(int id, String name, String date_order, int idProduct){
        this.id = id;
        this.name = name;
        this.date_order = date_order;
        this.idProduct = idProduct;
    }
    
    public Order(int id, String name, String date_order){
        this.id = id;
        this.name = name;
        this.date_order = date_order;
    }
    
    public Order(int id, String name, String date_order, Product product){
        this.id = id;
        this.name = name;
        this.date_order = date_order;
        this.product = product;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date_order
     */
    public String getDate_order() {
        return date_order;
    }

    /**
     * @param date_order the date_order to set
     */
    public void setDate_order(String date_order) {
        this.date_order = date_order;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    @Override
    public String toString(){
        return "Name: " + this.name + "Date order: " + this.date_order + " ID Product: " + this.getIdProduct();
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
}
