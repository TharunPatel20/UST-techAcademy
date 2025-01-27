package streamAPI;

/*
 * Question 4: Concatenate Strings
Given a list of strings:
List<String> words = Arrays.asList("Java", "is", "fun", "with", "Streams");
Use the Stream API to concatenate all the strings into a single string. What is the expected output?

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "is", "fun", "with", "Streams");
		
		String ans = words
						.stream()
						.collect(Collectors.joining(" "));
		System.out.println(ans);
	}
}
