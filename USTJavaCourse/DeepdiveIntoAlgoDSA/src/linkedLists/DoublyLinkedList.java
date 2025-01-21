package linkedLists;

import java.util.LinkedList;

//Write the program based on doubly linked list in collections in java and create the linked list in java.
import java.util.LinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {
        // LinkedList in java.util supports doubly linked list
        LinkedList<Integer> dll = new LinkedList<>();

        // Adding elements to the doubly linked list
        dll.add(1);
        dll.add(20);
        dll.add(15);

        System.out.println("Initial Doubly Linked List: " + dll);

        // Adding elements at specific positions
        dll.addFirst(10); // Add at the beginning
        dll.addLast(25);  // Add at the end
        System.out.println("After adding elements at the beginning and end: " + dll);

        // Removing elements
        dll.removeFirst(); // Remove the first element
        dll.removeLast();  // Remove the last element
        System.out.println("After removing the first and last elements: " + dll);

        // Accessing elements
        int firstElement = dll.getFirst();
        int lastElement = dll.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Iterating over the list
        System.out.println("Iterating over the list:");
        for (int element : dll) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Check if the list contains a specific element
        boolean contains20 = dll.contains(20);
        System.out.println("Does the list contain 20? " + contains20);

        // Get the size of the list
        int size = dll.size();
        System.out.println("Size of the list: " + size);

        // Clear the list
        dll.clear();
        System.out.println("List after clearing: " + dll);
    }
}

