package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;  // Current retry attempt
    private static final int maxRetryCount = 3;  // Maximum retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying test: " + result.getName() + " | Attempt: " + retryCount);
            return true;  // Retry the test
        }
        return false;  // No more retries
    }
}
