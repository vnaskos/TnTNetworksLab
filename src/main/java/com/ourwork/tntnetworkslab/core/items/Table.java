package com.ourwork.tntnetworkslab.core.items;

import java.util.ArrayList;

/**
 *
 * @author Vasilis Naskos
 */
public abstract class Table {
    
    protected final ArrayList<Column> columns;
    private String tableName;
    
    public Table() {
        this.columns = new ArrayList<>();
    }
    
    public Table(String tableName, String[] names, int[] values, Class[] types) {
        this();
        this.tableName = tableName;
        
        for(int i=0; i<names.length; i++) {
            Column c = new Column(names[i], values[i], types[i]);
            columns.add(c);
        }
    }
    
    public String[] getNames() {
        String[] names = new String[columns.size()];

        for (int i = 0; i < names.length; i++) {
            names[i] = columns.get(i).toString();
        }

        return names;
    }

    public Class[] getTypes() {
        Class[] types = new Class[columns.size()];

        for (int i = 0; i < types.length; i++) {
            types[i] = columns.get(i).getType();
        }

        return types;
    }
    
    public Column getColumn(int i) {
        return columns.get(i);
    }
    
    public int getColumnCount() {
        return columns.size();
    }
    
    public int getRowCount() {
        return columns.get(0).getSize();
    }
    
    public String getTableName() {
        return tableName;
    }
    
    public void clear() {
        for(Column c : columns) {
            c.clear();
        }
    }

    @Override
    public String toString() {
        return tableName;
    }
}
