package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	
//	@Test(retryAnalyzer = RetryAnalyzer.class)
	@Test
	void retryTest() {
		Assert.fail();
	}

}
