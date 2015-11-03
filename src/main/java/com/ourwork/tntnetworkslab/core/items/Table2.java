package com.ourwork.tntnetworkslab.core.items;

/**
 * Predefined table for exercise 1
 * 
 * @author Vasilis Naskos
 */
public class Table2 extends Table {

    public enum ColumnOrder {
        A(0), S(1), N(2), B(3), Q(4);
        
        private final int order;
        
        private ColumnOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return order;
        }
    }
    
    public Table2() {
        this("Άσκηση 2 - Πίνακας");
    }
    
    public Table2(String tableName) {
        super(
                tableName,
                new String[]{"α", "s", "n",  "B", "Q"},
                new Class[]{Integer.class, Integer.class, Integer.class, Double.class, Double.class}
        );
    }
    
    public Column getColumn(ColumnOrder c) {
        return columns.get(c.getOrder());
    }
    
}
