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
public class Product {
    private int id;
    private String name;
    private int time;
    
    private List<Order> orders;
    private List<Detail> detail;

    public Product(int id, String name, int time, List<Order> orders, List<Detail> detail) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.orders = orders;
        this.detail = detail;
    }
    
    public Product(int id, String name, int time, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.orders = orders;
    }

    public Product(int id, String name, int time) {
        this.id = id;
        this.name = name;
        this.time = time;
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
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * @return the detail
     */
    public List<Detail> getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + " Name: " + name + " Time: " + time ;
    }
    
}
