package sample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmaticDemoTest {
	ArithmaticDemo demo;
	System.Logger logger;
	static int i=1;
	@BeforeAll
	public static void beforeEverytest() {
		System.out.println("Before all testcases");
	}
	@BeforeEach
	 public void createDemoObject() {
		demo = new ArithmaticDemo();
		logger = System.getLogger("MyLogger");
		logger.log(System.Logger.Level.INFO, "task start for testcase:"+i);
	}
	
	@Test
	public void testAddition() {
		
		assertEquals(3,demo.addition(1, 2));
	}
	@Test
	public void testMultiply() {
		
		assertEquals(2,demo.multiply(1, 2));
	}
	@Test
	public void testDivision() {
		
		assertEquals(.5,demo.divide(1, 2));
	}
	@Test
	public void testSubstract() {
		
		assertEquals(-1,demo.substract(1, 2));
		assertNotEquals(1,demo.substract(1, 2));
	}
	
	@AfterEach
	public void deleteDemoObject() {
		demo=null;
		
		logger.log(System.Logger.Level.INFO, "task end for testcase:"+i);
		i++;
		System.gc();
	}
	
	@AfterAll
	public static void afterEverytest() {
		System.out.println("after all testcases");
	}
}
