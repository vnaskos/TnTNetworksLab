package com.ourwork.tntnetworkslab.cli.input;

import com.ourwork.tntnetworkslab.cli.Exercise;
import com.ourwork.tntnetworkslab.core.io.IOItem;

/**
 *
 * @author Vasilis Naskos
 */
public abstract class IOManager {
    
    protected Exercise exercise;

    public IOManager() {}
    
    public IOManager(Exercise ex) {
        this.exercise = ex;
    }
    
    public abstract IOItem getInputItem();
    public abstract void outputResults(IOItem output);

    public Exercise getExercise() {
        return exercise;
    }
    
}
