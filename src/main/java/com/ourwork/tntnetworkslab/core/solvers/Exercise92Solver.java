package com.ourwork.tntnetworkslab.core.solvers;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;

/**
 *
 * @author Vasilis Naskos
 */
public class Exercise92Solver implements ExerciseSolver {

    @Override
    public IOItem solve(IOItem input) {
        float load, waitingTime;

        System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
        float arrivalRate = ((IONumeric) input.next()).getFloat();
        float serviceRate = ((IONumeric) input.next()).getFloat();
        int quadraticDispresion = ((IONumeric) input.next()).getInt();

        load = arrivalRate * serviceRate;
        float b = 1.0f;

        for(int i = 1; i <= quadraticDispresion; i++) {
            b = load * b / (i + load * b);
        }
        float x = (quadraticDispresion * b) / (quadraticDispresion - load * (1 - b));
        waitingTime = x * serviceRate / (quadraticDispresion - load);

        IOItem output = new IOArray(
            new IOItem[]{
                new IONumeric(load),
                new IONumeric(waitingTime)
            });
        
        return output;
    }
    
}
