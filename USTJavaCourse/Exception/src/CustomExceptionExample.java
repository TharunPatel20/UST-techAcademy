
//The assignment focuses on honing your skills in Java Exception Handling through practical coding
//exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
//ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
//addressing IOException during file operations.
//Problem Statement 3: Custom Exception
//You are provided with a program skeleton that involves a custom exception class. Your task is to
//complete the program by adding the necessary exception handling code to catch and handle the
//CustomException that may be thrown based on a specific condition.
//



class CustomException extends Exception {
 // Add any additional customizations if needed
	CustomException(String message){
		super(message);
	}
}
public class CustomExceptionExample {
	public static void main(String[] args) {
		int userInput = -5;
		try {
			validateInput(userInput);
		} catch (CustomException e) {
			System.out.println("Custom Exception caught: " + e.getMessage());
		}
 }
	 private static void validateInput(int input) throws CustomException {
		 if (input < 0) {
			 throw new CustomException("Input cannot be negative");
		 }
	 }
}









//Learning Outcomes:
//• Implement and handle a custom exception in Java.
//• Understand the use of custom exceptions for specific conditions.
//This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
//such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
//IOException. Through practical coding exercises, students will enhance their skills in identifying,
//handling, and customizing exceptions for various situations.