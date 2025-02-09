package streamAPI;

import java.util.Arrays;
import java.util.List;

/*
 * Question 2: 
Map and Sum Given a list of strings representing numbers: 
List numberStrings = Arrays.asList("1", "2", "3", "4", "5"); 
Use the Stream API to convert each string to its corresponding integer and 
then find the sum of all the integers. What is the expected output?

 */

public class Question2 {
	public static void main(String[] args) {
		List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
		int sum = numberStrings
						.stream()
						.map((num)-> Integer.parseInt(num))
						.reduce(0, (a,b)->a+b);

		System.out.println("sum of numbers in "+numberStrings+"-> "+sum);
	}

}
