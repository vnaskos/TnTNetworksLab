package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.items.Table1;
import com.ourwork.tntnetworkslab.core.items.Table;
import com.ourwork.tntnetworkslab.core.items.Table2;

/**
 *
 * @author Vasilis Naskos
 */
public class Solver {
    
    public static Table solve(Table table) {
        ExerciseSolver solver;
        
        if(table instanceof Table1) {
            solver = new Exercise1Solver();
            return solver.solve(table);
        }
        else if(table instanceof Table2) {
            solver = new Exercise2Solver();
            return solver.solve(table);
        }
        
        
        return null;
    }
    
}
