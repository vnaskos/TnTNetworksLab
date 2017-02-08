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
            case 1: exercise = Exercise.EX1; break;
            case 2: exercise = Exercise.EX2; break;
            case 4: exercise = Exercise.EX4; break;
            case 6: exercise = Exercise.EX6; break;
            case 8: exercise = Exercise.EX8; break;
            case 91: exercise = Exercise.EX9_1; break;
            case 92: exercise = Exercise.EX9_2; break;
            case 10: exercise = Exercise.EX10; break;
        }
    }

    @Override
    public IOItem getInputItem() {
        IOItem input = null;
        
        switch(exercise) {
            case EX1: input = createEx1Input(); break;
            case EX2: input = createEx2Input(); break;
            case EX4: input = createEx4Input(); break;
            case EX6: input = createEx6Input(); break;
            case EX8: input = createEx8Input(); break;
            case EX9_1: input = createEx91Input(); break;
            case EX9_2: input = createEx92Input(); break;
            case EX10: input = createEx10Input(); break;
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
    
    private IOItem createEx4Input() {
        System.out.println("\nARITMOS EKSERXOMENON GRAMMWN KAI FORTIO KINISIS:");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextInt()),
                    new IONumeric(in.nextFloat())
                });
        
        return input;
    }
    
    private IOItem createEx6Input() {
        System.out.println("\n PITHANOTHTA MPLOKARISMATOS KAI FORTIO KINHSHS: \n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat())
                });
        
        return input;
    }
    
    private IOItem createEx8Input() {
        System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat())
                });
        
        return input;
    }
    
    private IOItem createEx91Input() {
        System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat())
                });
        
        return input;
    }
    
    private IOItem createEx92Input() {
        System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextFloat()),
                    new IONumeric(in.nextInt())
                });
        
        return input;
    }
    
    private IOItem createEx10Input() {
        System.out.println("\nARITMOS GRAMMWN KAI FORTIO:\n");
        
        IOArray input = new IOArray(
                new IONumeric[]{
                    new IONumeric(in.nextInt()),
                    new IONumeric(in.nextInt())
                });
        
        return input;
    }

    @Override
    public void outputResults(IOItem output) {
        switch (exercise) {
            case EX1: outputEx1Results(output); break;
            case EX2: outputEx2Results(output); break;
            case EX4: outputEx4Results(output); break;
            case EX6: outputEx6Results(output); break;
            case EX8: outputEx8Results(output); break;
            case EX9_1: outputEx91Results(output); break;
            case EX9_2: outputEx92Results(output); break;
            case EX10: outputEx10Results(output); break;
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
    
    private void outputEx4Results(IOItem output) {
        System.out.printf("-----------------------------------------------------------\n");
        System.out.printf("PITHANOTHTA ANAMONIS = %.4f, M.T. KLHSEON ANAMONHS = %.4f\n", 
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
        System.out.printf("-----------------------------------------------------------\n");
        System.out.printf("MESOS XRONOS ANAMONIS = %.4f, M.T. APODOSH GRAMMON = %.4f\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
        System.out.printf("-----------------------------------------------------------\n");
    }
    
    private void outputEx6Results(IOItem output) {
        System.out.printf("O ARITHMOS TWN GRAMMWN EINAI= %d\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
        System.out.printf("H AKRIBHS PITHANOTHTA MPLOKARISMATOS (BN)= %.5f\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
    }
    
    private void outputEx8Results(IOItem output) {
        System.out.printf(" ----------------------------------------------------------------\n");
        System.out.printf(" FORTIO KINHSHS=',%.6f,'   M.T. XRONOY ANAMONHS=',%.6f\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
        System.out.printf(" ----------------------------------------------------------------\n");
    }
    
    private void outputEx91Results(IOItem output) {
        System.out.printf(" ----------------------------------------------------------------\n");
        System.out.printf(" FORTIO KINHSHS=',%.6f,'   M.T. XRONOY ANAMONHS=',%.6f\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
        System.out.printf(" ----------------------------------------------------------------\n");
    }
    
    private void outputEx92Results(IOItem output) {
        System.out.printf(" FORTIO KINHSHS=',%.5f,'   M.T. XRONOY ANAMONHS=',%.5f\n", 
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
    }
    
    private void outputEx10Results(IOItem output) {
        System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.6f %%, APODOSH GRAMMWN (n)= %.6f %%\n",
                ((IONumeric) output.next()).getValue(),
                ((IONumeric) output.next()).getValue());
    }
}
