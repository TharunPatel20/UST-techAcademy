package strategyPattern2;

//Concrete Strategy 1 - Bubble Sort
class BubbleSort implements SortingStrategy {
	@Override
	public void sort(int[] array) {
		System.out.println("Performing Bubble Sort...");
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap elements
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
