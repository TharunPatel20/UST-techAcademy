package sortingAlgorithm;
/*
Problem Statement 2:
Develop a Java program to implement the bubble sort algorithm for sorting an array of integers in
ascending order. Allow the user to input the array elements, and display the sorted array. Learn to
implement a basic sorting algorithm. 
 **/
public class BubbleSort {
	public static void main(String[] args) {
		int input[] = {4,3,45,1,0,-2,-5,-9,-10 };
		System.out.println("before sorting");
		for(int i:input) {
			System.out.print(i+", ");
		}
		int output[] = bubbleSort(input);
		System.out.println("\nafter sorting");
		for(int i:output) {
			System.out.print(i+", ");
		}
	}
	private static int[] bubbleSort(int[] input) {
		int n=input.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(input[i]>input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}
}
