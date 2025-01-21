package strings;


/*

Write the program to create string and based on the following string 
methods in java using IntelliJ IDE
               a. to Uppercase.
               b. to Lowercase
               c. length
               d. char At (int index)
               e. substring
*/

public class Level2StringMethods {
	public static void main(String args[]) {
		String hello = "Hello World";
		System.out.println("hello.toUpperCase():"+hello.toUpperCase());
		System.out.println("hello.toLowerCase(): "+hello.toLowerCase());
		System.out.println("hello.length(): "+hello.length());
		System.out.println("hello.charAt(index)(index=4): "+hello.charAt(4));
		System.out.println("hello.substring(6,11) (6=start,11=end): "+hello.substring(6,11));
	}
}
