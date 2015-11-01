package com.ourwork.tntnetworkslab.core.items;

import java.util.ArrayList;

/**
 *
 * @author Vasilis Naskos
 */
public class Column {
    
    private final String name;
    private final Class type;
    private final ArrayList<Number> columnData;

    public Column(String name, Class type) {
        this.name = name;
        this.type = type;
        this.columnData = new ArrayList<>();
    }

    public Class getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public void addCell(int i, Number val) {
        columnData.add(i, val);
    }
    
    public void addCell(Number val) {
        addCell(columnData.size(), val);
    }
    
    public void setCell(int j, Number val) {
        columnData.set(j, val);
    }
    
    public Number getCell(int j) {
        return columnData.get(j);
    }
    
    public Number[] getCells() {
        return columnData.toArray(new Number[]{});
    }
    
    public int getSize() {
        return columnData.size();
    }
    
    public void clear() {
        columnData.clear();
    }
}
