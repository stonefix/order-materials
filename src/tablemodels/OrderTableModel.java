/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Order;

/**
 *
 * @author user
 */
public class OrderTableModel extends AbstractTableModel{

    
    private static final int ID = 0;
    private static final int NAME = 1;
    private static final int DATE_ORDER = 2;
    //private static final int DATE = 3;
    //private static final int DATEFINISH = 4;
    
    private String[] columnNames = {"Идентификатор", "Имя", "Дата заказа"}; 
    
    private List<Order> items;
    
    public OrderTableModel(List<Order> items){
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
       Order tmpOrders = items.get(row);
        
           switch(column) {
        
            case ID:
                    return tmpOrders.getId();
            case NAME:
                    return tmpOrders.getName();
            case DATE_ORDER:
                    return tmpOrders.getDate_order();
            default:
                    return tmpOrders.getName();
        }
        
    }
    
}
