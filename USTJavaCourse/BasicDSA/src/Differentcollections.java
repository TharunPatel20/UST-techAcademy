import java.util.LinkedList;

/**
 * 1. Create a Java Application to Work with different collections 
 * - Arrays, Linked List, Double, Linked List and Circular Linked List.
 */


public class Differentcollections {

	public static void main(String[] args) {
		Differentcollections diffCollections = new Differentcollections();
		diffCollections.arrays();
		diffCollections.linkedList();
	}
		//Arrays method		
	public void arrays() 
		{
			int[] array = new int[10];
			//to add elements to array
			for(int i=0;i<array.length;i++) {
				array[i] = 10+ i*10;
			}
			
			for(int ele:array) {
				System.out.println(ele +", ");
		}
		
	}
	public void linkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(300);
		list.add(200);
		list.add(100);
		
		System.out.println("Before removing elemets");
		
		list.stream().forEach((ele)->System.out.println(ele));
		System.out.println("after removing elemets by passing index ");
		list.remove(2);
		list.stream().forEach((ele)->System.out.println(ele));
	}
}
