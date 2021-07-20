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
public class Detail {
    private int id;
    private int time;
    private String name;
    private int idMaterial;
    private int idProduct;

    public Detail(int id, int time, String name, int idMaterial, int idProduct) {
        this.id = id;
        this.time = time;
        this.name = name;
        this.idMaterial = idMaterial;
        this.idProduct = idProduct;
    }

    public Detail(int id, int time, String name) {
        this.id = id;
        this.time = time;
        this.name = name;
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
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
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
     * @return the idMaterial
     */
    public int getIdMaterial() {
        return idMaterial;
    }

    /**
     * @param idMaterial the idMaterial to set
     */
    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
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
    
    @Override
    public String toString(){
        return "ID: " + id + " name: " + name + " time: " + time;
    }
    
   
}
