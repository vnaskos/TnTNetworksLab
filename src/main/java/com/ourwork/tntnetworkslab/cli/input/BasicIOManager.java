package com.ourwork.tntnetworkslab.cli.input;

import com.ourwork.tntnetworkslab.cli.Exercise;
import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;
import java.util.Scanner;

/**
 *
 * @author Vasilis Naskos
 */
public class BasicIOManager extends IOManager {

    private final Scanner in;
    
    public BasicIOManager() {
        in = new Scanner(System.in);
        selectExercise();
    }
    
    private void selectExercise() {
        System.out.println("\nEpilogi ergastiriou");

        int erg = in.nextInt();
        switch (erg) {
            case 1:
                exercise = Exercise.EX1;
                break;
            case 2:
                exercise = Exercise.EX2;
                break;
        }
    }

    @Override
    public IOItem getInputItem() {
        IOItem input = null;
        
        switch(exercise) {
            case EX1:
                input = createEx1Input();
                break;
            case EX2:
                input = createEx2Input();
                break;
        }
        
        return input;
    }
    
    private IOItem createEx1Input() {
        System.out.println("\nARITMOS GRAMMWN KAI FORTIO:\n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextInt()),
                    new IONumeric(in.nextInt())
                });
        
        return input;
    }
    
    private IOItem createEx2Input() {
        System.out.println("\nFORTIO, GRAMMES, PHGES:\n");

        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextInt()),
                    new IONumeric(in.nextInt()),
                    new IONumeric(in.nextInt())
                });
        
        return input;
    }

    @Override
    public void outputResults(IOItem output) {
        switch (exercise) {
            case EX1:
                outputEx1Results(output);
                break;
            case EX2:
                outputEx2Results(output);
                break;
        }
    }
    
    private void outputEx1Results(IOItem output) {
        System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
    }
    
    private void outputEx2Results(IOItem output) {
        System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
    }
    
}
