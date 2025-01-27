package streamAPI;

/*
 * Question 3: 
Find Maximum Element Given a list of doubles: 
List doubles = Arrays.asList(1.5, 2.8, 3.2, 2.0, 5.1); 
Use the Stream API to find the maximum element. 
What is the expected output?

 */

import java.util.Arrays;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(1.5, 2.8, 3.2, 2.0, 5.1); 
		Double max = doubles
						.stream()
						.max((a,b)->a.compareTo(b))
						.orElse( 0.0);
		System.out.println("maximum number in "+doubles+"-> "+max);

	}

}
