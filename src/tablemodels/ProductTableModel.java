/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Material;
import model.Product;

/**
 *
 * @author user
 */
public class ProductTableModel extends AbstractTableModel{

    private static final int ID = 0;
    private static final int NAME = 1;
    private static final int TIME = 2;
    
    private String[] columnNames = {"Идентификатор", "Имя", "Время сборки"};

    private List<Product> items;
    
    public ProductTableModel(List<Product> items){
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
       return items.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Object getValueAt(int row, int column) {
         Product tmpProduct = items.get(row);
        
        switch(column) {
        
            case ID:
                    return tmpProduct.getId();
            case NAME:
                    return tmpProduct.getName();
            case TIME:
                    return tmpProduct.getTime();
            default:
                    return tmpProduct.getName();
        }
    }
    
}
