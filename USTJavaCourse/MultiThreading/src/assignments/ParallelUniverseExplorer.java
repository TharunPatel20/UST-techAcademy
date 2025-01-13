package assignments;


//Skill Description:
//Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
//captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
//essential concepts, tools, and techniques required for efficient parallel and reactive programming.
//Problem Statement 2:
//Extend the program to perform a sequential exploration of a timeline using Sequential Streams.
//Implement a method that simulates sequential exploration tasks.
//Code:


import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class ParallelUniverseExplorer extends RecursiveAction {
 private static final ForkJoinPool pool = new ForkJoinPool();
 private static final List<String> sequentialTimeline = List.of("one","two", "three", "four", "five");
 public static void main(String[] args) {
 // TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
 // TODO: Simulate sequential exploration
	 
	 sequentialExloration();	 
 }
 // TODO: Implement methods for sequential exploration
 
 static void sequentialExloration(){
	 sequentialTimeline.stream().forEach( (i) -> System.out.println(i))));
 }

@Override
protected void compute() {
	// TODO Auto-generated method stub
	
}
}






//Learning Outcomes:
//• Apply Sequential Streams for sequential exploration.
//• Develop skills in simulating sequential exploration tasks.
//This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
//allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
//skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
//reactive communication, and ensuring thread synchronization for shared resources.