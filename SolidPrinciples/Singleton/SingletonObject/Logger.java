package SolidPrinciples.Singleton.SingletonObject;

public class Logger {
    // Step 1: Create a private static instance
    private static   Logger instance;

    // Step 2: Private constructor (no outside instantiation)
    private Logger() {
        System.out.println("Logger initialized");
    }

    // Step 3: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // lazy initialization
        }
        return instance;
    }

    // Utility method
    public void logg(String message) {
        System.out.println("[LOG] " + message);
    }
}
