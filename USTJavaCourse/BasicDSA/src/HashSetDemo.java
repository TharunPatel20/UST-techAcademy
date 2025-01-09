//Write a Java Program to work with HashSet.

import java.util.HashSet;

public class HashSetDemo{

	public static void main(String[] args) {
		HashSet<Integer>  hashSet= new HashSet<>();
		
		System.out.println( hashSet.isEmpty());
		hashSet.add(20);
		hashSet.add(3);
		hashSet.add(99);
		hashSet.add(1);
		hashSet.add(50);
		System.out.println( "size = " +hashSet.size());
		hashSet.forEach(ele-> System.out.print(ele+" ") );System.out.println();
		hashSet.remove(3);
		hashSet.forEach(ele-> System.out.print(ele+" ") );System.out.println();
		System.out.println(hashSet.contains(20));
		System.out.println(hashSet.contains(0));
		
		hashSet.stream().map(ele->ele*100).forEach(ele->System.out.print(ele+" "));System.out.println();

		hashSet.stream().filter(ele->ele%2==0).forEach(ele->System.out.print(ele+" "));System.out.println();
		
		System.out.println(hashSet);
	}

}
