package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise10Solver implements ExerciseSolver {

    @Override
    public IOItem solve(IOItem input) {
        float blockProbability = 1.0f;
        
        int numberOfLines = ((IONumeric) input.next()).getInt();
        int load = ((IONumeric) input.next()).getInt();

        for (int i = 1; i <= numberOfLines; i++) {
            blockProbability = (load * blockProbability) / (i + load * blockProbability);
        }
        
        float linePerformance = load * (1 - blockProbability) / numberOfLines;

        IOItem output = new IOArray(
                new IOItem[]{
                    new IONumeric(blockProbability),
                    new IONumeric(linePerformance)
                });
        
        return output;
    }
    
}
