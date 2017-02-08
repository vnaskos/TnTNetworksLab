package com.ourwork.tntnetworkslab.cli;

import com.ourwork.tntnetworkslab.cli.input.BasicIOManager;
import com.ourwork.tntnetworkslab.cli.input.IOManager;
import com.ourwork.tntnetworkslab.core.solvers.Exercise10Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise1Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise2Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise4Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise6Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise8Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise91Solver;
import com.ourwork.tntnetworkslab.core.solvers.Exercise92Solver;
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
            case EX1: solver = new Exercise1Solver(); break;
            case EX2: solver = new Exercise2Solver(); break;
            case EX4: solver = new Exercise4Solver(); break;
            case EX6: solver = new Exercise6Solver(); break;
            case EX8: solver = new Exercise8Solver(); break;
            case EX9_1: solver = new Exercise91Solver(); break;
            case EX9_2: solver = new Exercise92Solver(); break;
            case EX10: solver = new Exercise10Solver(); break;
            default: solver = null;
        }

        while(true) {
            iOManager.outputResults(solver.solve(iOManager.getInputItem()));
        }
    }
    
}
