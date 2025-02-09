package sortingAlgorithms;

public class SelectionSort {

	int[] data;
	SelectionSort(int[] data){
		this.data = data;
	}
	
	void sort() {
		System.out.println("\n");
		System.out.print("SelectionSort -> ");
		
		for(int i=0;i<data.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<data.length;j++) {
				if(data[j] < data[minIndex]) {
					 minIndex = j;
				}
			}	
			if (minIndex != i) {
	            int temp = data[i];
	            data[i] = data[minIndex];
	            data[minIndex] = temp;
			}
		}
		for(int x: data )	System.out.print( x +" ");
	}

}
