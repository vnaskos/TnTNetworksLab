package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.items.Table1;
import com.ourwork.tntnetworkslab.core.items.Table1.ColumnOrder;
import com.ourwork.tntnetworkslab.core.items.Table;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise1Solver implements ExerciseSolver {

    @Override
    public Table solve(Table table) {
        Table1 sol = (Table1) table;
        
        for(int i=0; i<table.getRowCount(); i++) {
            int s = (int) sol.getColumn(ColumnOrder.S).getCell(i);
            
            double a = (double) sol.getColumn(ColumnOrder.A).getCell(i);
            double b = 1.0f, q = 0;
            
            for (int j = 1; j <= s; j++) {
                b = (a * b) / (j + a * b);
                q = (a * (1 - b)) / s;
            }
            
            sol.getColumn(ColumnOrder.B).setCell(i, b*100);
            sol.getColumn(ColumnOrder.Q).setCell(i, q*100);
        }
        
        return sol;
    }
}
