
public class ScenarioStats {
    private String scenarioName;
    private double score;
    private int hitCount;
    private int missCount;

    // Getters and Setters
    public void setScenarioName(String name) {
        this.scenarioName = name;
    }

    public String getScenarioName() {
        return this.scenarioName;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public void setHitCount(int hits) {
        this.hitCount = hits;
    }

    public void setMissCount(int misses) {
        this.missCount = misses;
    }

    public double getTotalAccuracy() {
        int totalShots = hitCount + missCount;
        if (totalShots == 0)
            return 0.0;
        return (double) hitCount / totalShots;
    }
}
