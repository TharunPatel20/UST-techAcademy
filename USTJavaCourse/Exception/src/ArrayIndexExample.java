
//The assignment focuses on honing your skills in Java Exception Handling through practical coding
//exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
//ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
//addressing IOException during file operations.
//Problem Statement 2: Array Index Out of Bounds Exception
//You are given a program skeleton that involves an array and a method accessing an element. Your
//task is to complete the program by adding the necessary exception-handling code to catch and
//handle the ArrayIndexOutOfBoundsException that may occur if an invalid index is accessed.


//Coding:
public class ArrayIndexExample {
	public static void main(String[] args) {
		 int[] numbers = {1, 2, 3, 4, 5};
		 try {
			 int result = accessArrayElement(numbers, 10);
			 System.out.println("Result: " + result);
		 } catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		 }
 }
	private static int accessArrayElement(int[] array, int index) {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException("Invalid array index");
		}
		return array[index];
 }
}




//Learning Outcomes:
//• Recognize and handle ArrayIndexOutOfBoundsException.
//• Develop skills in managing array indices.
//This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
//such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
//IOException. Through practical coding exercises, students will enhance their skills in identifying,
//handling, and customizing exceptions for various situations.