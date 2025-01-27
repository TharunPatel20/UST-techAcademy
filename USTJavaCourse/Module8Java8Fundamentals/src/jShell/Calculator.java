package jShell;


/*
 * Java SE New Features: Covers Versions 9, 10, 11, and 12
Skill Name Proficiency Duration
Java Intermediate 2hr
Skill Description:
In this course, you'll gain expertise in interactive coding and real-time code execution. You'll learn to
experiment with Java code snippets, quickly test concepts, and evaluate outcomes. This skill
enhances your ability to prototype, troubleshoot, and develop Java applications with efficiency and
precision.
Problem Statement 1:
Create a Java program that uses JShell to execute mathematical expressions input by the user. The
program should prompt the user to input expressions for evaluation, handle basic mathematical
operations (addition, subtraction, multiplication, division), and display the results. It should also
provide error handling for invalid expressions to prevent program crashes, and the user can continue
entering expressions until they decide to exit.
Example:
public static void main(String[] args) {
 JShell jShell = JShell.create();
 Scanner scanner = new Scanner(System.in);
 while (true) {
 // Prompt the user to input a mathematical expression
 // Check if the user wants to exit
 if (input.equalsIgnoreCase("exit")) {
 break;
}
 String jShellCode = // your jshell code expression
 jShell.eval(jShellCode);
 // Handle JShell events
 for (SnippetEvent event : jShell.snippets()) {
 if (event.status() == SnippetEvent.Status.VALID) {
 // Display the result
 } else {
 // Handle invalid expressions

 }
 }
 }
 */

import jdk.jshell.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Calculator {
    public static void main(String[] args) {
        Map<String, String> history = new TreeMap<>();
        // Create JShell instance
        try (JShell jShell = JShell.create();
             Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Welcome to the JShell Calculator!");
            System.out.println("Enter a mathematical expression (e.g., 2 + 2) \n or type 'exit' to quit. or type 'history' to get previous calculations");
            System.out.println("Type 'history/his' to view previously evaluated expressions.");

            // Loop to continuously prompt user for input
            while (true) {
                // Prompt the user to input a mathematical expression
                System.out.print("Please enter a mathematical expression: ");
                String input = scanner.nextLine();
                
                // Check if the user wants to exit
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                
                // Check if the user wants to see history
                if (input.contains("his")) {
                    if (history.isEmpty()) {
                        System.out.println("No history available yet.");
                    } else {
                        System.out.println("Calculation History:");
                        history.forEach((expression, result) -> 
                            System.out.println(expression + " = " + result));
                    }
                    continue;
                }
                
                // Evaluate the expression in JShell
                try {
                    Iterable<SnippetEvent> events = jShell.eval(input);
                    events.forEach(System.out::println);
                    // Process the result
                    boolean resultDisplayed = false;
                    for (SnippetEvent event : events) {
                        if (event.status() == Snippet.Status.VALID) {
                            String result = event.value();
                            
                            if (result != null) {
                            	history.put(input, result); // Store in history
                                System.out.println("Result: " + result);
                                resultDisplayed = true;
                            } else {
                            	history.put(input, "invalid"); // Store in history
                                System.out.println("Expression is valid but has no result.");
                            }
                        }
                    }
                    // If no result is displayed, handle as invalid input
                    if (!resultDisplayed) {
                        System.out.println("Invalid expression. Please try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Error evaluating expression. Please try again.");
                }
            }
            System.out.println("Thank you for using JShell Calculator. Goodbye!");
        }
    }
}


