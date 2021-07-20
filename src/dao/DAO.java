/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Main.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Detail;
import model.Material;
import model.MaterialWarehouse;
import model.Order;
import model.Product;

/**
 *
 * @author user
 */
public class DAO {
    
    public DAO(){}
    
    public Product getProductById(int idProduct){
        Product product = null;
        String sql = "SELECT * FROM products WHERE ID = ?";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idProduct);
            
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    int time = rs.getInt(3);
                   
                   product = new Product(id, name, time);
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return product;
    }
    
    public Product getProductByName(String nameProduct){
        Product product = null;
        String sql = "SELECT * FROM products WHERE Name = ?";
        
        try(Connection conn = DbConnection.connect();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nameProduct);
            
            try(ResultSet rs = ps.executeQuery()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int time = rs.getInt(3);
                
                product = new Product(id, name, time);
            } 
        }
       
        catch(SQLException ex){
            System.out.println(ex.toString());
        } 
        return product;
        
    }
    
    public void insertProduct (String name, String time) {
    
        Connection conn = DbConnection.connect();
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO products(Name, Time) VALUES(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, time);
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
    }
    
    public void updateProduct(String name, String time){
        String sql = "UPDATE products SET Time = ? WHERE Name = ?";
        try(Connection conn = DbConnection.connect();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, time);
            ps.setString(2, name);
            ps.execute();
        }
        
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
    public void deleteProductById(String ID){
    
        String sql = "DELETE FROM products WHERE ID = ?";
        
        try(Connection conn = DbConnection.connect();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ID);
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
    public int getCountOfProduct(){
        int count = 0;
        String sql = "SELECT count(Name) FROM products";
        try(Connection conn = DbConnection.connect();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            
             try(ResultSet rs = ps.executeQuery()) {
                count  = rs.getInt(1);
            } 
        }
        catch(SQLException ex){}
        return count;
    }
    
    public void insertMaterial (String name, String mass) {
    
        Connection conn = DbConnection.connect();
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO material(Name, Mass) VALUES(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, mass);
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
    }
    
    public void updateMaterial(int id, String name, String mass){
         
        String sql = "UPDATE material SET Name = ?, Mass = ? WHERE ID = ?";
        try(Connection conn = DbConnection.connect();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, name);
            ps.setString(2, mass);
            ps.setInt(3, id);
            ps.execute();
        }
        
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Material getMaterialById(int idMaterial){
    
        Material material = null;
        String sql = "SELECT * FROM material WHERE ID = ?";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idMaterial);
            
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String mass = rs.getString(3);
                   
                   material = new Material(id, name, mass);
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return material;
    
    }
    
    public Material getMaterialByName(String nameMaterial) {
        Material material = null;
        String sql = "SELECT * FROM material WHERE Name = ?";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nameMaterial);
            
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String mass = rs.getString(3);
                   
                   material = new Material(id, name, mass);
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return material;
    }
    
    public List<Detail> getDetailByProductId(int idProduct){
        List<Detail> list = new ArrayList<Detail>();
        String sql = "SELECT * FROM detail WHERE \"ID Product\" = ?";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idProduct);
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    int time = rs.getInt(2);
                    String name = rs.getString(3);
                    int idMaterial = rs.getInt(5);
                    Detail detail = new Detail(id, time, name, idProduct, idMaterial);
                    list.add(detail);
                  
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
    }
    
    public List<Detail> getAllDetails(){
        List<Detail> list = new ArrayList<Detail>();
        String sql = "SELECT * FROM detail";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){

            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    int time = rs.getInt(2);
                    String name = rs.getString(3);
                    int idProduct = rs.getInt(4);
                    int idMaterial = rs.getInt(5);
                    Detail detail = new Detail(id, time, name, idProduct, idMaterial);
                    list.add(detail);
                  
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
        
    }
    
    public List<Material> getAllMaterials(){
        List<Material> list = new ArrayList<Material>();
        String sql = "SELECT * FROM material";
        
         try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){

            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String mass = rs.getString(3);
                   // String idProduct = rs.getString(4);
                   Material material = new Material(id, name, mass);   
                   list.add(material);
              
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
        
    }
    
    public List<Order> getAllOrders(){
        List<Order> list = new ArrayList<Order>();
        String sql = "SELECT * FROM order_";
            
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){

            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String dateOrder = rs.getString(3);
                    int idProduct = rs.getInt(4);
                   Order order = new Order(id, name, dateOrder, idProduct);   
                   list.add(order);
              
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
      }
    
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM products";
        
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){

            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    int time = rs.getInt(3);
                   // String idProduct = rs.getString(4);
                   Product product = new Product(id, name, time);   
                   list.add(product);
              
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
        
    }
    
    
    
    public List<MaterialWarehouse> getAllMaterialWarehouse(){
        List<MaterialWarehouse> list = new ArrayList<MaterialWarehouse>();
        String sql = "SELECT * FROM material_warehouse";
        
         try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){

            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    int price = rs.getInt(2);
                    String units = rs.getString(3);
                    int idMaterial = rs.getInt(4);
                   // String idProduct = rs.getString(4);
                   MaterialWarehouse material = new MaterialWarehouse(id, price, units, idMaterial);   
                   list.add(material);
              
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return list;
    
    }
    
    public int timeFromProduct(int idProduct){
        Product product = null;
        String sql = "SELECT Time FROM products WHERE ID = ?";
        int time = 0;
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idProduct);
            
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    time = rs.getInt(1);  
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return time;
    }
  
    public int timeFromDetail(int idProduct){
         String sql = "SELECT Time FROM detail WHERE  \"ID Product\" = ?";
        int fullTime = 0;
        try (Connection conn = DbConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idProduct);
            
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    int time = rs.getInt(1);
                  //  int idProd = rs.getInt(4);
                  //  int idMaterial = rs.getInt(5);
                    fullTime += time;
              }
            } 
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return fullTime;
    }
    
}

