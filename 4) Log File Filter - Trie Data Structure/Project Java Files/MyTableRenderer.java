/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie.Project;

/**
 *
 * @author Sai Nikhilesh Reddy <sainikhilaie@gmail.com>
 */

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MyTableRenderer implements TableCellRenderer{
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      
        if(table.getModel().getValueAt(row, 0).toString().equalsIgnoreCase("Warning"))
            renderer.setBackground(new Color(255, 255, 102));
        else if(table.getModel().getValueAt(row, 0).toString().equalsIgnoreCase("Error")){
            renderer.setBackground(new Color(255, 19, 26));
        }
        else{
            renderer.setBackground(new Color(255,255,255));
        }
        return renderer;
    }
}

/**
 * 
        else if(table.getModel().getValueAt(row, 0).toString().equalsIgnoreCase("POPUP")){
            renderer.setBackground(new Color(255,170,198));
        }
        else if(table.getModel().getValueAt(row, 0).toString().equalsIgnoreCase("DOGGY")){
            renderer.setBackground(new Color(255,255,102));
        }else{
            renderer.setBackground(new Color(240,221,127));
        }
 */