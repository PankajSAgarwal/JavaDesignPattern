

package maths;

import java.util.*;
import java.util.concurrent.*;

public class Statistics {
    private final Collection<Integer> values = new ConcurrentLinkedQueue<>();

    public void add(int value) {
        values.add(value);
    }

    public int size() {
        return values.size();
    }

    public double getMean() {
        return values.stream()
            .mapToInt(Integer::intValue)
            .summaryStatistics().getAverage();
    }

    public double getVariance() {
        double mean = getMean();
        return values.stream()
            .mapToDouble(value -> mean - value)
            .map(value -> value * value)
            .sum() / size();
    }

    public double getStdDev() {
        return Math.sqrt(getVariance());
    }
}
