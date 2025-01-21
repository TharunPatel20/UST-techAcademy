package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
// Write the program to search for duplicate in an array in java
public class SearchForDuplicate {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,6,7,7,8,8,9,0,0,5,6,7,8,3};
		
		LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();//to maintain order of insertion
		HashSet<Integer> values = new HashSet<>();

		for(int value:array) {
			if(!values.contains(value)) {
				values.add(value);
			}
			else {
				if(!duplicates.contains(value)) {
					duplicates.add(value);
				}
			}
		}
		duplicates.forEach(x->System.out.println(x));
	}

}
