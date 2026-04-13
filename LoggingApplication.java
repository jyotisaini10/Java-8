import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingApplication {

    private static final Logger logger = LogManager.getLogger(LoggingApplication.class);

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            logger.error("ArithmeticException occurred.");
        }

        
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            logger.error("ArrayIndexOutOfBoundsException occurred.");
        }

        
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            logger.error("NullPointerException occurred.");
        }
    }
}