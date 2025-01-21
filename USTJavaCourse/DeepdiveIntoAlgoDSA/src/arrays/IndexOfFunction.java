package arrays;
//Write the code to create indexOf function in java
public class IndexOfFunction {

	public static void main(String[] args) {
		int[] array = {1,2,4,3,57,6,5,0,9,7,8};
		
		int index = indexOf(2, array);
		System.out.print(index== -1 ? "number does not exists" : "number found at index " + index);
 
	}
	static int indexOf(int number, int[] array) {
		for(int i=0;i<array.length;i++) {
			if(number == array[i]) return i;
		}
		
		return -1;
	}

}
