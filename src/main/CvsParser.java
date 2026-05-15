
import java.io.File;

public class CvsParser {

    private final String defaultCvsPath = pathToCvs();

    public static String pathToCvs() {
        String path = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\FPSAimTrainer\\FPSAimTrainer\\cvs";
    try{
    if (new File(path).exists()) {
        return path;
    } else {
        return "./cvsExamples/";
    }
    } catch (Exception e) {
        System.out.println("Error determining CVS path: " + e.getMessage());
        return "./cvsExamples/";
    }

}
    public static void main(String[] args) {
    
    
    
        CvsParser parser = new CvsParser();
        String pathToCheck = args.length > 0 ? args[0] : parser.defaultCvsPath;
        parser.checkLogDirectory(pathToCheck);
    }



    public void checkLogDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            System.out.println("Warning: Cvs directory not found at " + path);
        } else {
            System.out.println("Cvs directory located successfully.");
        }
    }
}
