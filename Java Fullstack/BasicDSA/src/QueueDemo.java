//Write a Java Program to work with Queue

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
//  first in last out
	public static void main(String[] args) {
		Queue<Integer>  queue = new PriorityQueue<>();
		System.out.println("poll "+queue.poll()); //null
		try {
			System.out.println("remove "+queue.remove());
		}catch(Exception e){
			e.printStackTrace();}
		
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(10);
		
		System.out.println(queue);
		queue.add(300);
		queue.add(49);
		queue.add(910);
		System.out.println(queue);
		
		System.out.println("poll "+queue.poll());

		System.out.println("remove "+queue.remove());
		
		queue.peek();
		System.out.println("peek "+queue.peek());
		
		System.out.println(queue);
	}
}
