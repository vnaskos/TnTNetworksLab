package com.ourwork.tntnetworkslab.cli;

import com.ourwork.tntnetworkslab.cli.input.BasicIOManager;
import com.ourwork.tntnetworkslab.cli.input.IOManager;
import com.ourwork.tntnetworkslab.core.solvers.Exercise1Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise2Solver;
import com.ourwork.tntnetworkslab.core.solvers.ExerciseSolver;

/**
 *
 * @author Vasilis Naskos
 */
public class TnTNetworksCli {
    
    private IOManager iOManager;
    private ExerciseSolver solver;
    
    public void executeBasicManager() {
        iOManager = new BasicIOManager();

        switch (iOManager.getExercise()) {
            case EX1:
                solver = new Exercise1Solver();
                break;
            case EX2:
                solver = new Exercise2Solver();
                break;
            default:
                solver = null;
        }

        while(true) {
            iOManager.outputResults(solver.solve(iOManager.getInputItem()));
        }
    }
    
}
