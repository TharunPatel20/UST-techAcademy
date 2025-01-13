import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;


public class Main{
	public static void main(String[] args) {
		
		ForkJoinPool pool = ForkJoinPool.commonPool();
		int sum[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		TaskRecursive rtask = new TaskRecursive(sum,0,sum.length-1);
		System.out.println(pool.invoke(rtask));
	}
}


 class  TaskRecursive extends RecursiveTask<Integer> {
	private static final long serialVersionUID = 1L;
	int arr[];
	int start;
	int end;
	int minimum = 5;

	public TaskRecursive(int[] arr, int start, int end){
		this.arr = arr;
		this.start = start;
		this.end = end;
	}
	
	public Integer calculateSum() {
		System.out.println("fork calculateSum");
		return IntStream.rangeClosed(start, end)
				.map(i->arr[i]).sum();
	}
	
	int i=0;
	@Override
	protected Integer compute() {
		if(end -start < minimum)
			return calculateSum();
		
		int mid = start + (end-start)/2;
		TaskRecursive left = new TaskRecursive(arr,start,mid);
		TaskRecursive right = new TaskRecursive(arr,mid+1,end);
		System.out.println("compute");
		right.fork();
		return left.compute()+right.join();
	}	

}



