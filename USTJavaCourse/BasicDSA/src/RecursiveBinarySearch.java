//3. Write a Java Program to Perform Binary Search using Recursion


public class RecursiveBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {20,30,33,47,49,50,60,95,99};
		int key = 99;
		
		int ans = recursiveBinarySearch(arr,0, arr.length, key);
		System.out.println(ans<0 ? "not found":" found at " +ans);

	}

	private static int recursiveBinarySearch(int[] arr,int low, int high, int key) {
		
		if(low > high ) return -1;
		
		int mid = (high -low)/2 + low;
		
		if(key == arr[mid])		return mid;
		
		else if(key < arr[mid]) return recursiveBinarySearch(arr,low, mid-1, key);
	
		else  	return recursiveBinarySearch(arr,mid+1, high, key);
	}
}