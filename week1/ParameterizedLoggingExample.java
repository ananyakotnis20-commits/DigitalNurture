import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "Alice";
        int loginAttempts = 3;

        // Single parameter logging
        logger.info("User {} has logged into the system.", username);

        // Multiple parameters logging
        logger.warn("User {} failed to log in. Attempt number: {}.", username, loginAttempts);

        // Parameterized logging with exceptions (the exception is always the last argument)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occurred while processing transaction for user {}: ", username, e);
        }
    }
}