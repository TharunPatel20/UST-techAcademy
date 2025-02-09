package sortingAlgorithms;

public class QuickSort {
	int[] data;
	public QuickSort(int[] data) {
		this.data=data;
	}

	public void sort() {
		System.out.println("\n");
		System.out.print("QuickSort-> ");
		
		int start=0;
		int end = data.length-1;
		quicksort(data,start,end);
		
		for(int x: data )	System.out.print( x +" ");
	}
	private void quicksort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			//pi=partitionIndex
			int pi = partition(arr,left,right);
			
			quicksort(arr,left,pi-1);
			quicksort(arr,pi+1,right);
		}
	}

	private int partition(int[] arr, int left, int right) {
		 
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);  
        return i + 1;
	}

	private void swap(int[] arr, int i, int j) {
		
		int temp = arr[i] ;
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
