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
public class Material {
    
    private int id;
    private String name;
    private String mass;
    private List<MaterialWarehouse> warehouses;
    private List<Detail> details;

    public Material(int id, String name, String mass, List<MaterialWarehouse> warehouses, List<Detail> details) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.warehouses = warehouses;
        this.details = details;
    }
    
    public Material(int id, String name, String mass, List<MaterialWarehouse> warehouses) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.warehouses = warehouses;
    }
    
    public Material(int id, String name, String mass) {
        this.id = id;
        this.name = name;
        this.mass = mass;
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
     * @return the mass
     */
    public String getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * @return the warehouses
     */
    public List<MaterialWarehouse> getWarehouses() {
        return warehouses;
    }

    /**
     * @param warehouses the warehouses to set
     */
    public void setWarehouses(List<MaterialWarehouse> warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * @return the details
     */
    public List<Detail> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(List<Detail> details) {
        this.details = details;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + " name: " + name + " mass: " + mass;
    }
    
}
