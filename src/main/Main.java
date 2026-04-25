public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing KovaaK's Aim Trainer Stat Tracker...");
        StatParser parser = new StatParser();
        parser.checkLogDirectory("./logs/");
    }
}