package SolidPrinciples.Singleton.EagerExample;

public class Logger {
        // Step 1: Create the instance eagerly when class loads
        private static final Logger instance = new Logger();

        // Step 2: Private constructor
        private Logger() {
            System.out.println("Logger initialized");
        }

        // Step 3: Public method to access instance
        public static Logger getInstance() {
            return instance;
        }

        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
}
