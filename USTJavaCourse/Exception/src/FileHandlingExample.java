//The assignment focuses on honing your skills in Java Exception Handling through practical coding
//exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
//ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
//addressing IOException during file operations.

//Problem Statement 4: File Handling Exception
//You are given a program skeleton that reads from a file using traditional file I/O. Your task is to
//complete the program by adding the necessary exception handling code to catch and handle the
//IOException that may occur during file operations.

//Coding:

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
	 public static void main(String[] args) {
		 String currentDirectory = System.getProperty("user.dir");
	     // Print the current working directory
	     System.out.println("Current working directory: " + currentDirectory);
		 String fileName = currentDirectory+"/src/simple.txt";
		 try {
			 readFromFile(fileName);
		 } catch (IOException e) {
			 System.out.println("IOException caught: " + e.getMessage());
		 }
	 }
	 private static void readFromFile(String fileName) throws IOException {
		 try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			 String line;
		 while ((line = reader.readLine()) != null) {
			 System.out.println(line);
		 	}
		 }
	 }
}


//Learning Outcomes:
//• Recognize and handle IOException in file operations.
//• Implement effective exception handling for file I/O.
//This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
//such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
//IOException. Through practical coding exercises, students will enhance their skills in identifying,
//handling, and customizing exceptions for various situations.