package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        for (double[] solution: population) {
            double alpha = random.nextDouble();
            if (alpha > 0.4) {
                double sigma = random.nextDouble();
                if (sigma < 0.5){
                    int point1 = random.nextInt(solution.length);
                    solution[point1] += random.nextGaussian() * 0.4;
                }
            }
        }
        return population;
    }
}
