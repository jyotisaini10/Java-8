import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Custom Exception
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class DataProcessingApp {

    private static final Logger logger = LogManager.getLogger(DataProcessingApp.class);

    public static void main(String[] args) {

        // Test cases
        processData("10 20 30");     // Valid
        processData("10 abc 30");    // Invalid
        processData("");             // Empty
    }

    public static void processData(String input) {

        try {
            // Check empty input
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("No data provided.");
            }

            String[] values = input.split(" ");

            for (String value : values) {
                try {
                    Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new InvalidDataException("\"" + value + "\" is not a valid number.");
                }
            }

            System.out.println("No exception");

        } catch (InvalidDataException e) {
            System.out.println("Exception: InvalidDataException - " + e.getMessage());
            logger.error("InvalidDataException occurred.");

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
            logger.error("IllegalArgumentException occurred.");
        }
    }
}