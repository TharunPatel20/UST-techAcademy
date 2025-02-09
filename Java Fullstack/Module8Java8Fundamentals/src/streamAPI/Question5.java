package streamAPI;


/*
 * Question 5: Group by Length
Given a list of strings:
List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
Use the Stream API to group the strings by their length. Return a Map where the key is the length of
the strings, and the value is a list of strings with that length. What is the expected output?

 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Question5 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		Map<Integer,List<String>> map = words
									.stream()
									.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
}
