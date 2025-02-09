package testNG;

import org.testng.annotations.Test;

public class TestNGexample {

	
	@Test
	void testMethod1() {
		System.out.println("method-1");
	}
	@Test
	void appleMethod() {
		System.out.println("method-apple");
	}
	
	@Test
	void manMethod() {
		System.out.println("method-man");
	}
	
	@Test
	void bigMethod() {
		System.out.println("method-big");
	}
}
