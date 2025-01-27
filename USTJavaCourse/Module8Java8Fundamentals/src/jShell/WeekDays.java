package jShell;



/*
 * Problem Statement 3: 
Create a Java program that accepts a numerical input representing a day of the week
(1 for Monday, 2 for Tuesday, etc.). Utilize a switch expression (Java 12) to determine the corresponding day 
and display its name. Handle a minimum of five cases to cover all weekdays 
and include a default case for invalid input. The program should provide user-friendly 
messages indicating the day of the week based on the input, and the code should be well-documented 
to explain its purpose and functionality. 
Example:
 int dayOfWeek = //enter day number; 
String dayName = switch (dayOfWeek) { 
case 1 -> "";
case 2 -> ""; 
//Enter other cases 
default -> ""; 
};

 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WeekDays {
	public static void main(String[] args) {
		Map<Integer,String> weekDays = new TreeMap<>();
		weekDays.put(1, "Monday");
		weekDays.put(2, "Tuesday");
		weekDays.put(3, "Wednesday");
		weekDays.put(4, "Thursday");
		weekDays.put(5, "Friday");
		weekDays.put(6, "Saturday");
		weekDays.put(7, "Sunday");
		
		Scanner scan = new Scanner(System.in);
				
		boolean exit=false;
		while(!exit) {
			System.out.println("enter the day you need, or '0' for exit");
			int input=scan.nextInt();
			switch(input) {
			case 1,2,3,4,5,6,7:
				System.out.println("today is "+weekDays.get(input));
			break;
			case 0:
				System.out.println("exit....!");
				exit=!exit;
				break;
			default:
				System.out.println("invalid input");
				break;
			}
		}
	}
}
