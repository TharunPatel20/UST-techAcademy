package collections;
import java.util.ArrayList;
import java.util.ListIterator;

// Write the program based on interface listIterator<E> and import java.collections and import java.ListIterator in java 

public class ListIteratorDemo {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("fine");
	
	ListIterator<String> listItirator  = list.listIterator();
	
	
	while(listItirator.hasNext()) 
		System.out.println(listItirator.next());
	
	listItirator = list.listIterator();
	while(listItirator.hasNext()) {
		if((listItirator.next().equals("fine"))) {
			listItirator.set("five");
		}
	}
	
	listItirator = list.listIterator();
	while(listItirator.hasNext()) 
		System.out.println(listItirator.next());
	
//	reverse listIterator
	while(listItirator.hasPrevious()) 
		System.out.println(listItirator.previous());
	}
}
