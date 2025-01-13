//Problem Statement 1:
//You are provided with a program skeleton that performs a division operation. However, there is a
//possibility of encountering a DivideByZeroException. Your task is to complete the program by adding
//the necessary exception-handling code to catch and handle this exception gracefully.
//Coding:

public class DivideByZeroExample {
 public static void main(String[] args) {
 int numerator = 10;
 int denominator = 0;
 // TODO: Implement exception handling for divide by zero
 try {
	 System.out.println("Result: "+  divideNumbers(numerator, denominator));
 }catch(ArithmeticException e) {
	 System.out.println(e.getMessage());
 }

 }
 private static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
 // TODO: Implement exception handling for divide by zero
	 return numerator / denominator;
	
	 
 }
}