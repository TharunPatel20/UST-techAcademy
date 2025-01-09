//Write a Java Program to work with  Stack

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("is stack empty ?? "+stack.isEmpty());
		
		stack.push(20);
		stack.push(1);
		stack.push(49);
		stack.push(3);
		stack.push(50);
		stack.push(28);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.add(99);
		System.out.println(stack);
		System.out.println("is stack empty "+stack.isEmpty());
		
		stack.remove(2);
		System.out.println(stack);
	}
}
