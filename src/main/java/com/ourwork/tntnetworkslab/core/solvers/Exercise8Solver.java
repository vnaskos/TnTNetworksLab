package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise8Solver implements ExerciseSolver {

    @Override
    public IOItem solve(IOItem input) {
        float load, waitingTime;
        
        float arrivalRate = ((IONumeric) input.next()).getFloat();
        float serviceRate = ((IONumeric) input.next()).getFloat();
        float quadraticDispresion = ((IONumeric) input.next()).getFloat();

        load = arrivalRate * serviceRate;
        waitingTime = load * (1 + quadraticDispresion) * serviceRate / ((1 - load) * 2);

        IOItem output = new IOArray(
                new IOItem[]{
                    new IONumeric(load),
                    new IONumeric(waitingTime)
                });
        
        return output;
    }
    
}
