package sortingAlgorithms;

public class MergeSort {
int[] data;
	
	public MergeSort(int[] data) {
		this.data=data;
	}

	public void sort() {
		System.out.println("\n");
		System.out.print("MergeSort-> ");
		int start=0;
		int end = data.length-1;
		mergesort(data,start,end);
		for(int x: data )	System.out.print( x +" ");
	}

	private void mergesort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			int mid = left +(right-left)/2;
			
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		
	}

	public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
