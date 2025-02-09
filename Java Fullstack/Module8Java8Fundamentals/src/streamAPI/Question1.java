package streamAPI;

import java.util.Arrays;
import java.util.List;

/*
 * Question 1: 
 * Filter and Count Given a list of integers:
 * List numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
 * Use the Stream API with lambda expressions to filter out the even numbers and count them. 
 * What is the expected output?
 * 
 */



public class Question1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		int sum =	numbers
							.stream()
							.filter((num)-> num%2==0)
							.reduce(0, (a,b)->a+b);

		System.out.println("sum of enen numbers in "+numbers+"-> "+sum);
	}

}
