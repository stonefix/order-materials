/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Material;
import model.Order;

/**
 *
 * @author user
 */
public class MaterialTableModel extends AbstractTableModel{
    
    private static final int ID = 0;
    private static final int NAME = 1;
    private static final int MASS = 2;
    
    private String[] columnNames = {"Идентификатор", "Наименование материала", "Масса"};

    private List<Material> items;
    
    public MaterialTableModel(List<Material> items){
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int column) {
        Material tmpMaterial = items.get(row);
        
        switch(column) {
        
            case ID:
                    return tmpMaterial.getId();
            case NAME:
                    return tmpMaterial.getName();
            case MASS:
                    return tmpMaterial.getMass();
            default:
                    return tmpMaterial.getName();
        }
        
    }
    
}
