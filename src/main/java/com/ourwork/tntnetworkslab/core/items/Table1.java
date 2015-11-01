package com.ourwork.tntnetworkslab.core.items;

/**
 * Predefined table for exercise 1
 * 
 * @author Vasilis Naskos
 */
public class Table1 extends Table {

    public enum ColumnOrder {
        S(0), A(1), B(2), Q(3);
        
        private final int order;
        
        private ColumnOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return order;
        }
    }
    
    public Table1() {
        this("Άσκηση 1 - Πίνακας");
    }
    
    public Table1(String tableName) {
        super(
                tableName,
                new String[]{"s", "α", "B", "Q"},
                new Class[]{Integer.class, Double.class, Double.class, Double.class}
        );
    }
    
    public Column getColumn(ColumnOrder c) {
        return columns.get(c.getOrder());
    }
    
}
