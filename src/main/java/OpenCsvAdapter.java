import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
public class OpenCsvAdapter implements DataReader {

    public final String defaultCsvPath = pathToCsv();

    public static String pathToCsv() {
        String path = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\FPSAimTrainer\\FPSAimTrainer\\stats";
        try {
            if (new File(path).exists()) {
                return path;
            } else {
                return "./csvExamples/";
            }
        } catch (Exception e) {
            System.out.println("Error determining CSV path: " + e.getMessage());
            return "./csvExamples/";
        }
    }

    // Fulfills the DataReader interface contract
    @Override
    public List<ScenarioStats> readData(String filePath) {
        try (Reader reader = Files.newBufferedReader(Paths.get(filePath))) {
            return new CsvToBeanBuilder<ScenarioStats>(reader)
                    .withType(ScenarioStats.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();
        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
            return new ArrayList<>(); // Return empty list to prevent null pointer exceptions
        }
    }

    public void checkLogDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            System.out.println("Warning: CSV directory not found at " + path);
        } else {
            System.out.println("CSV directory located successfully.");
        }
    }

    public static void main(String[] args) {
        OpenCsvAdapter adapter = new OpenCsvAdapter();
        String pathToCheck = args.length > 0 ? args[0] : adapter.defaultCsvPath;
        adapter.checkLogDirectory(pathToCheck);
        
        // Example execution of the interface method:
        // List<ScenarioStats> data = adapter.readData(pathToCheck + "\\example_scenario.csv");
    }
}