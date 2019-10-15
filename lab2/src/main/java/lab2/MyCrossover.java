package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        double[] offspring1 = new double[p1.length];
        double[] offspring2 = new double[p1.length];
        for (int j = 0; j < p1.length; j++){
            offspring1[j] = 0.4 * p1[j] + 0.6 * p2[j];
            offspring2[j] = 0.6 * p1[j] + 0.4 * p2[j];
        }
        children.add(offspring1);
        children.add(offspring2);
        return children;
    }
}
