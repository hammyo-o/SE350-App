import java.io.File;

public class StatParser {
    private String path = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\FPSAimTrainer\\FPSAimTrainer\\stats";
    public void checkLogDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            System.out.println("Warning: Stat directory not found at " + path);
        } else {
            System.out.println("Stat directory located successfully.");
        }
    }
}