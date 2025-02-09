package sortingAlgorithms;

public class ShellSort {
	int[] data;
	public ShellSort(int[] data) {
		this.data=data;
	}

	public void sort() {
		System.out.println("\n");
		System.out.print("ShellSort-> ");
		
		
		int n = data.length;
        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = data[i];
                int j;
                // Shift earlier gap-sorted elements up until the correct location for `array[i]` is found
                for (j = i; j >= gap && data[j - gap] > temp; j -= gap) {
                    data[j] = data[j - gap];
                }
                // Place `temp` (original `array[i]`) in its correct position
                data[j] = temp;
            }
        }
		
		for(int x: data )	System.out.print( x +" ");
	}

}
