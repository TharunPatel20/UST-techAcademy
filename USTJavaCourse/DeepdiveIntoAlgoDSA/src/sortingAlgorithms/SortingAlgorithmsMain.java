package sortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithmsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgorithmsMain Algorithm = new SortingAlgorithmsMain();
		int[] items = {100,90,80,70,60,50,40,12,10,9,8,7,6,5,4,3,2,1,35,30,24,19,14};
		System.out.print("original data-> ");
		for(int x: items )	System.out.print( x +" ");

		new SelectionSort(Arrays.copyOf(items, items.length)).sort();
		new InsertionSort(Arrays.copyOf(items, items.length)).sort();
		new BubbleSort(Arrays.copyOf(items, items.length)).sort();
		new MergeSort(Arrays.copyOf(items, items.length)).sort();
		new QuickSort(Arrays.copyOf(items, items.length)).sort();
		new ShellSort(Arrays.copyOf(items, items.length)).sort();		
	}
}