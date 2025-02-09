import java.util.LinkedList;

/**
 * Create a Java Application to Work with different collections -
 *  Arrays, 
 *  Linked List, 
 *  Double Linked List and 
 *  Circular Linked List.
 *  
 */


public class Differentcollections {

	public static void main(String[] args) {
		Differentcollections diffCollections = new Differentcollections();
		
		System.out.println("-----------Arrays-------------");
		diffCollections.arrays();
		
		System.out.println("\n-------Linked List---------");
		diffCollections.linkedList();
		
		System.out.println(" ---Double Linked List---");
		diffCollections.doubleLinkedList();
		
		System.out.println("---circular Linked List---");
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertElement(20);
		cll.insertElement(30);
		cll.printList();
		cll.insertElement(40);
		cll.insertElement(60);
		cll.printList();
//		removes the head or first element
		cll.removeElement();
		cll.printList();
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
		
		System.out.println("adding elements");
		
		list.stream().forEach((ele)->System.out.println(ele));
		System.out.println("after removing elements by passing index ");
		list.remove(2);
		list.stream().forEach((ele)->System.out.println(ele));
	}
	public void doubleLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		
		System.out.println("Before removing elemets");
		
		list.stream().forEach((ele)->System.out.println(ele));
		System.out.println("after removing elements by passing index ");
		list.remove(1);
		list.forEach(System.out::println);
		
		list.add(1, 66);
		System.out.println("after adding element at an  index ");
		list.forEach(System.out::println);
		
		
		list.set(1,40);
		System.out.println("after updating element at an  index ");
		list.forEach(System.out::println);
	}

}
