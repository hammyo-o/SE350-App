import java.util.List;

public class AverageAccuracyCalc implements StatCalc {
    @Override
    public double calculate(List<ScenarioStats> data) {
        if (data == null || data.isEmpty())
            return 0.0;

        double sum = 0.0;
        for (ScenarioStats stat : data) {
            sum += stat.getTotalAccuracy();
        }
        return sum / data.size();
    }
}