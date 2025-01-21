package map;


import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<>();
		
		hmap.put(4,"four");
		hmap.put(2,"two");
		hmap.put(1,"one");
		hmap.put(3,"three");
		System.out.println(hmap);
		
		System.out.println("hmap.containsKey(4):"+hmap.containsKey(4));
		System.out.println("hmap.containsValue(\"five\"): "+hmap.containsValue("five"));
		
		System.out.println("hmap.get(1):"+hmap.get(1));
		
	}
}
