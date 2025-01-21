package fibonacciSequence;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
	static ArrayList<Integer> fibb = new ArrayList<Integer>();
	public static void main(String[] args) {	
		int nums=20;
		for(int i=0;i<nums;i++) {
			fibb.add(findFibonacci(i));
		}
		System.out.println(fibb);
	}

	private static int findFibonacci(int num) {
		if(num <1 ) return 0;
		if (num<=2) return 1;
		return findFibonacci(num-1) + findFibonacci(num-2);
	}
}


