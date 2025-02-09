package sortingAlgorithms;

public class InsertionSort {
	int[] data;
	
	public InsertionSort(int[] data) {
		this.data=data;
	}

	public void sort() {
		System.out.println("\n");
		System.out.print("InsertionSort-> ");
		
		//InsertionSort
		for(int i=1; i < data.length; i++) {
			int temp = data[i];
			int j=i-1;
			while(j >= 0 && data[j]>temp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
		
		for(int x: data )	System.out.print( x +" ");
	}
}
