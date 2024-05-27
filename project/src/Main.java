import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Main class to demonstrate the functionality of the application.
 * @version 2024.0527 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");

        // Run the test suite
        Result result = JUnitCore.runClasses(AllTests.class);

        // Print test results
        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Test failures:");

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }

        // Continue with your application logic here
        // Create instances of File1 to File10 and call some methods for demonstration
        File1 file1 = new File1();
        file1.setValue(10);
        System.out.println("Value in File1: " + file1.getValue());

        File2 file2 = new File2();
        // Call methods on file2 if needed

        File3 file3 = new File3();
        // Call methods on file3 if needed

        // Continue with instances of File4 to File10 as needed
        File4 file4 = new File4();
        // Call methods on file4 if needed

        File5 file5 = new File5();
        // Call methods on file5 if needed

        File6 file6 = new File6();
        // Call methods on file6 if needed

        File7 file7 = new File7();
        // Call methods on file7 if needed

        File8 file8 = new File8();
        // Call methods on file8 if needed

        File9 file9 = new File9();
        // Call methods on file9 if needed

        File10 file10 = new File10();
        // Call methods on file10 if needed
    }
}

