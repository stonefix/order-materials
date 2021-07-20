/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import dao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Main {
    public static void main(String[] args){
           
            DAO orderDao = new DAO();
            
            List<Order> listOrders = orderDao.getAllOrders();
            for (Order ord : listOrders) {
                System.out.println(ord.toString());
            }
            
            List<Material> listMaterials = orderDao.getAllMaterials();
            for (Material material : listMaterials) {
                System.out.println(material.toString());
            }
            
            List<Product> listProducts = orderDao.getAllProducts();
            for (Product product : listProducts) {
                System.out.println(product.toString());
            }
            
            List<MaterialWarehouse> listMaterialWarehouse = orderDao.getAllMaterialWarehouse();
            for (MaterialWarehouse mw : listMaterialWarehouse) {
                System.out.println(mw.toString());
            }
            
            List<Detail> listDetail = orderDao.getDetailByProductId(3);
            for (Detail detail : listDetail) {
                System.out.println(detail.toString());
            }
            
            
            Product productFromOrder = orderDao.getProductById(1);
            //for (Product product : listProducts2) {
                System.out.println(productFromOrder.toString());
            //}
            System.out.println(orderDao.timeFromDetail(3));
            System.out.println(orderDao.timeFromProduct(3));
           // readAllData();
           // getCountOfProduct();
    }
    

    
    
}
