package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.items.Table;
import com.ourwork.tntnetworkslab.core.items.Table2;
import com.ourwork.tntnetworkslab.core.items.Table2.ColumnOrder;

/**
 *
 * 
 */
public class Exercise2Solver implements ExerciseSolver {

    @Override
    public Table solve(Table table) {
         Table2 sol = (Table2) table;
            
            int  a, is, n, i;
            double e = 0.0f, b,  y = 0, anew = 0;

            for(int i1=0; i1<table.getRowCount(); i1++) {

                    a = (int) sol.getColumn(ColumnOrder.A).getCell(i1);
                    is = (int) sol.getColumn(ColumnOrder.S).getCell(i1);
                    n = (int) sol.getColumn(ColumnOrder.N).getCell(i1);

                    do {
                        b = a /(n - a * (1-e));
                        e = 1.0f;

                        for(i = 1; i <= is; i++) {
                                e = (n - i) * b * e / (i + (n - i) * b * e);
                        }

                        anew = n * b / (1 + b * (1 - e));
                        y = a * (1 - e) / is;
                    } while (Math.abs(anew - a) > 0.001);
                    
                    sol.getColumn(ColumnOrder.B).setCell(i1, e*100);
                    sol.getColumn(ColumnOrder.Q).setCell(i1, y*100);

            }
            
        return sol;
    }
}
    



      