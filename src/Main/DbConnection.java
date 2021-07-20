/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DbConnection {
    public static Connection connect(){
        Connection conn = null;
        try{

          //  Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:database_materials");
            System.out.println("Connected");
        }
       /* catch(ClassNotFoundException ex){
            System.out.println(ex + "");
            ex.printStackTrace();
        } */catch (SQLException ex) {
            System.out.println(ex + "");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
