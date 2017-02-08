package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

public class Exercise1Solver implements ExerciseSolver {
   
    @Override
    public IOItem solve(IOItem input) {
        float blockingProbability = 1.0F;
        float linePerformance = 0;

        int numberOfLines = ((IONumeric) input.next()).getInt();
        int load = ((IONumeric) input.next()).getInt();

        for(int i = 1; i <= numberOfLines; i++) {
            blockingProbability = (load * blockingProbability) / (i + load * blockingProbability);
            linePerformance = (load * (1 - blockingProbability)) / numberOfLines;
        }
        
        blockingProbability *= 100;
        linePerformance *= 100;
        
        IOItem output = new IOArray(
                new IOItem[] {
                    new IONumeric(blockingProbability),
                    new IONumeric(linePerformance)
                });
        
        return output;
    }
    
}
