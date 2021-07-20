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
public class MaterialWarehouse {
    private int id;
    private int price;
    private String units;
    private int idMaterial;
    private int count;

    public MaterialWarehouse(int id, int price, String units, int idMaterial, int count) {
        this.id = id;
        this.price = price;
        this.units = units;
        this.idMaterial = idMaterial;
        this.count = count;
    }
    
    public MaterialWarehouse(int id, int price, String units, int idMaterial) {
        this.id = id;
        this.price = price;
        this.units = units;
        this.idMaterial = idMaterial;
    }
    
    public MaterialWarehouse(int id, int price, String units) {
        this.id = id;
        this.price = price;
        this.units = units;
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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the units
     */
    public String getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(String units) {
        this.units = units;
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
    
    @Override
    public String toString(){
        return "ID: " + id + " Price: " + price + " Units: " + units + " ID Material: " + idMaterial;
    }

  
}
