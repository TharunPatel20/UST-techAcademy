package sample;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayDemoTest {

	
	@Test
	public void isArrayEqual() {
		int[] actual = {1,4,2,3,5,0};
		int[] Expected  = {0,1,2,3,4,5};
		Arrays.sort(actual);
		assertArrayEquals(Expected,actual);
	}
	

	@Test
	public void testException() {

		int[] actual = null;
		Assertions.assertEquals(1,actual.length);
		Assertions.assertThrows(Exception.class,()->{Arrays.sort(actual);});
	}
}
