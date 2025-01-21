package fibonacciSequence;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
	static ArrayList<Integer> fibb = new ArrayList<Integer>();
	public static void main(String[] args) {
		
	}

	private static int findFibonacci(int num) {
		if(num <=1 ) return 1;
		if (num==2) return 2;
		
		return findFibonacci(num-1) + findFibonacci(num-2);
		
	}

}
