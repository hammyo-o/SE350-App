import com.opencsv.bean.CsvBindByName;

public class ScenarioStats {

    @CsvBindByName(column = "Scenario Name")
    private String scenarioName;

    @CsvBindByName(column = "Accuracy")
    private double accuracy;

    @CsvBindByName(column = "Average FPS")
    private double averageFps;
    @CsvBindByName(column = "Screen Resolution")
    private String screenResolution;

}
