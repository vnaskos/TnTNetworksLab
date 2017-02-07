/*
 * Lab Application for
 * Telecommunications and Transmission Networks
 * Technical Educational Institute of Central Macedonia
 */
package com.ourwork.tntnetworkslab;

import com.ourwork.tntnetworkslab.core.io.IOArray;
import com.ourwork.tntnetworkslab.core.io.IOItem;
import com.ourwork.tntnetworkslab.core.io.IONumeric;
import com.ourwork.tntnetworkslab.core.solvers.Exercise1Solver;

/**
 * Main Project Class
 */
public class TnTNetworksLab {
    
    public static void main(String args[]) {
        
        int[] s = new int[]{30, 30, 30};
        int[] a = new int[]{45, 50, 55};
        
        Exercise1Solver s1 = new Exercise1Solver();
        
        for(int i=0; i<s.length; i++) {
            IOArray input = new IOArray(
                    new IONumeric[]{
                        new IONumeric(s[i]),
                        new IONumeric(a[i])
                    });
            
            IOItem output = s1.solve(input);

            System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n",
                    ((IONumeric) output.next()).getValue(),
                    ((IONumeric) output.next()).getValue());
        }
    }
    
}
