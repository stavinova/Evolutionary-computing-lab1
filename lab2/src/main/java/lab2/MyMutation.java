package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        //double s = 1;
        for (double[] solution: population) {
            double alpha = random.nextDouble();
            if (alpha > 0) {
                double sigma = random.nextDouble();
                if (sigma < 0.5){
                    int point1 = random.nextInt(solution.length);
                    solution[point1] += random.nextGaussian() * 0.4;
                    //for (int i = 0; i < solution.length; i++) {
                        //solution[i] = random.nextDouble() * 10 - 5.0;
                        //s *= Math.exp(0.1 * random.nextGaussian() + 0.1 * random.nextGaussian());
                        //double sigma1 = random.nextDouble() * 0.01;
                        //solution[i] += random.nextGaussian() * 0.3;
                    //}
                }
            }
        }
        // your implementation:

        //result population
        return population;
    }
}
