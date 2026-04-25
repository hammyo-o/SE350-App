import java.io.File;

public class StatParser {
    private final String defaultStatsPath = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\FPSAimTrainer\\FPSAimTrainer\\stats";

    public static void main(String[] args) {
        StatParser parser = new StatParser();
        String pathToCheck = args.length > 0 ? args[0] : parser.defaultStatsPath;
        parser.checkLogDirectory(pathToCheck);
    }

    public void checkLogDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            System.out.println("Warning: Stat directory not found at " + path);
        } else {
            System.out.println("Stat directory located successfully.");
        }
    }
}