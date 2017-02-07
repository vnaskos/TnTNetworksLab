package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 * 
 * @author Vasilis Naskos
 */
public class Exercise2Solver implements ExerciseSolver {
    
    @Override
    public IOItem solve(IOItem input) {
        double blockingProbability = 0.0;
        double linePerformance;
        double anew;

        int load = (int) ((IONumeric) input.next()).getValue();
        int numberOfLines = (int) ((IONumeric) input.next()).getValue();
        int numberOfSources = (int) ((IONumeric) input.next()).getValue();

        do {
            double b = load / (numberOfSources - load * (1 - blockingProbability));
            blockingProbability = 1.0f;

            for (int i = 1; i <= numberOfLines; i++) {
                blockingProbability = (numberOfSources - i) * b * blockingProbability / (i + (numberOfSources - i) * b * blockingProbability);
            }

            anew = numberOfSources * b / (1 + b * (1 - blockingProbability));
            linePerformance = load * (1 - blockingProbability) / numberOfLines;
        } while (Math.abs(anew - load) > 0.001);

        blockingProbability *= 100;
        linePerformance *= 100;
        
        //System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n", blockingProbability, linePerformance);
        IOItem output = new IOArray(
                new IOItem[]{
                    new IONumeric(blockingProbability),
                    new IONumeric(linePerformance)
                });
        
        return output;
    }
    
}
