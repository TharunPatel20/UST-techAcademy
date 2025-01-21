package map;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapToTreeMapSort {
    public static void main(String[] args) {
        
        HashMap<String, Integer> unsortedMap = new HashMap<>();

        
        unsortedMap.put("Apple", 50);
        unsortedMap.put("Banana", 10);
        unsortedMap.put("Cherry", 20);
        unsortedMap.put("Date", 40);
        unsortedMap.put("Elderberry", 30);

        System.out.println("Unsorted HashMap:");
        unsortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        //Transfer data to a TreeMap (keys will be sorted)
        TreeMap<String, Integer> sortedByKeyMap = new TreeMap<>(unsortedMap);

        System.out.println("\nTreeMap (Sorted by Keys):");
        sortedByKeyMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Step 3: Sort the TreeMap entries by values using sorted()
        List<Map.Entry<String, Integer>> sortedByValue = sortedByKeyMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue()) // Sort entries by value
            .collect(Collectors.toList());

        System.out.println("\nEntries Sorted by Values:");
        sortedByValue.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

