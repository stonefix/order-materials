/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Detail;


/**
 *
 * @author user
 */
public class DetailTableModel extends AbstractTableModel{
    
    private static final int ID = 0;
    private static final int TIME = 1;
    private static final int NAME = 2;
    
    private String[] columnNames = {"Идентификатор", "Время сборки", "Наименование детали"};

    private List<Detail> items;

    public DetailTableModel(List<Detail> items){
        this.items = items;
    }
    
    public int getMaterialId(int row){
        Detail tmpDetail = items.get(row);
        return tmpDetail.getIdMaterial();
    }
    
     @Override
    public int getRowCount() {
       return items.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        //To change body of generated methods, choose Tools | Templates.
         Detail tmpDetail = items.get(row);
        
        switch(column) {
        
            case ID:
                    return tmpDetail.getId();
            case TIME:
                    return tmpDetail.getTime();
            case NAME:
                    return tmpDetail.getName();
            default:
                    return tmpDetail.getName();
        }
    }
    
}
