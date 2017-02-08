package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise4Solver implements ExerciseSolver {

    @Override
    public IOItem solve(IOItem input) {
        float b = 1.0f;
        float waitingProbability,
                avgWaitingCalls,
                averageWaitingTime,
                linePerformance;
        
        int numberOfOutgoingLines = ((IONumeric) input.next()).getInt();
        float load = ((IONumeric) input.next()).getFloat();

        for(int i = 1; i <= numberOfOutgoingLines; i++) {
            b = (load * b) / (i + load * b);
        }
        waitingProbability = (numberOfOutgoingLines * b) / (numberOfOutgoingLines - load * (1 - b));
        avgWaitingCalls = waitingProbability * load / (numberOfOutgoingLines - load);
        averageWaitingTime = waitingProbability / (numberOfOutgoingLines - load);
        linePerformance = load / numberOfOutgoingLines;
        
        IOItem output = new IOArray(
                new IOItem[]{
                    new IONumeric(waitingProbability),
                    new IONumeric(avgWaitingCalls),
                    new IONumeric(averageWaitingTime),
                    new IONumeric(linePerformance)
                });
        
        return output;
    }
    
}
