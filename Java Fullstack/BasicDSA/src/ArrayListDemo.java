//Write a Java Program Array List

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> alist= new ArrayList<>();
		alist.add(40);
		alist.add(1);
		alist.add(20);
		alist.add(3);
		alist.add(9);
		alist.add(4);
		alist.add(6);
		alist.forEach(ele->System.out.print(ele+" ")); System.out.println();
		System.out.println(alist);
		System.out.println(alist.get(2));

		alist.remove(0);
		System.out.println(alist);
		
		alist.add(3, 88);
		System.out.println(alist);
	}

}
