import java.util.List;

public interface DataReader {
    List<ScenarioStats> readData(String filePath);
}