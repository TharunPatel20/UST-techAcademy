package testNG;

import org.testng.annotations.Test;

public class TestNGparallelExecution {

	@Test(priority=2)
	void priority2Method() {
		System.out.println("parallel execution");
	}
}
