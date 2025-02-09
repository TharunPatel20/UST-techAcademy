package strategyPattern2;

//Context class
class SortContext {
	private SortingStrategy sortingStrategy;

	public SortContext(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void executeSort(int[] array) {
		sortingStrategy.sort(array);
	}
}
