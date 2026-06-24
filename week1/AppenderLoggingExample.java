import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application has started successfully.");
        logger.debug("Debugging database connection pool...");
        logger.warn("Memory usage is reaching 80%.");
        logger.error("Critical database connection loss detected!");

        System.out.println("Check your console output and the newly created 'app.log' file in your project root.");
    }
}