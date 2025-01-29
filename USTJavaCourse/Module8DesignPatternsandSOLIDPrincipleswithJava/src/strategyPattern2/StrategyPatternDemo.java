package strategyPattern2;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        // Using Bubble Sort
        SortContext context = new SortContext(new BubbleSort());
        context.executeSort(array);
        
        // Print the sorted array
        System.out.println("Sorted array using Bubble Sort: " + java.util.Arrays.toString(array));
        
        // Using Merge Sort
        array = new int[]{5, 2, 9, 1, 5, 6};  // Reset array
        context.setSortingStrategy(new MergeSort());
        context.executeSort(array);
        
        // Print the sorted array
        System.out.println("Sorted array using Merge Sort: " + java.util.Arrays.toString(array));
        
        // Using Quick Sort
        array = new int[]{5, 2, 9, 1, 5, 6};  // Reset array
        context.setSortingStrategy(new QuickSort());
        context.executeSort(array);
        
        // Print the sorted array
        System.out.println("Sorted array using Quick Sort: " + java.util.Arrays.toString(array));
    }
}

