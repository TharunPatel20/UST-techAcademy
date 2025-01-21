package sortingAlgorithms;

public class BubbleSort {
	int[] data;
	public BubbleSort(int[] data) {
		this.data=data;
	}

	public void sort() {
		System.out.println("\n");
		System.out.print("BubbleSort-> ");
		
		//bubbleSort
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i] > data[j]) {
					data[j]= data[i] + data[j];
					data[i] = data[j]-data[i];
					data[j] = data[j] - data[i];
				}
			}
		}
		
		
		
		for(int x: data )	System.out.print( x +" ");
	}

}
