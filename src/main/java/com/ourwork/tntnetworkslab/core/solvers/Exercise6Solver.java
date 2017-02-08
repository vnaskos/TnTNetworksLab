/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise6Solver implements ExerciseSolver {

    @Override
    public IOItem solve(IOItem input) {
        int numberOfLines = 0;
        int nmax = 100000;
        double specificBlockProbability;

        float blockProbability = ((IONumeric) input.next()).getFloat();
        float load = ((IONumeric) input.next()).getFloat();

        specificBlockProbability = 1.0;
        for(int i = 1; i <= nmax; i++) {
            specificBlockProbability = load * specificBlockProbability / ((float) i + load * specificBlockProbability);
            if (blockProbability >= specificBlockProbability) {
                numberOfLines = i;
                i = nmax + 1;
            }
        }
        
        IOItem output = new IOArray(
                new IOItem[]{
                    new IONumeric(numberOfLines),
                    new IONumeric(specificBlockProbability)
                });
        
        return output;
    }
    
}
