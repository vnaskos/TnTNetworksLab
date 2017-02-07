package com.ourwork.tntnetworkslab.core.solvers;

public class Exercise2Solver {
    
    public void solve() {
        double blockingProbability = 0.0;
        double linePerformance;
        double anew;

        int load = 0;//TODO: give value
        int numberOfLines = 0;//TODO: give value
        int numberOfSources = 0;//TODO: give value

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
        System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n", blockingProbability, linePerformance);
    }
    
}
