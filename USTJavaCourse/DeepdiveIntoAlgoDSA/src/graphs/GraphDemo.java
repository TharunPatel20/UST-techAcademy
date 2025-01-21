package graphs;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;


public class GraphDemo {
	
	static class DemoGraph{
		int vertex;
		LinkedList<Integer> network[];
		
		DemoGraph(int vertex){
			this.vertex=vertex;
			network = new LinkedList[vertex];
			
			for(int i=0;i<vertex;i++) {
				network[i] = new LinkedList<>();
			}
		}
	}
	
	public static void main(String[] args) {
		int vertex = 6;
		Instant start = Instant.now();
		DemoGraph myGraph = new DemoGraph(vertex);
		
		addVertexEdge(myGraph,0,4);
		addVertexEdge(myGraph,1,0);
		addVertexEdge(myGraph,1,4);
		addVertexEdge(myGraph,2,1);
		addVertexEdge(myGraph,3,2);
		addVertexEdge(myGraph,4,2);
		addVertexEdge(myGraph,5,2);
		addVertexEdge(myGraph,0,2);
		
		
	
		outputGraph(myGraph);
		Instant end = Instant.now();
		System.out.println("duration in milliseconds -> "+Duration.between(start, end).toMillis()+"ms");
	}

	private static void outputGraph(DemoGraph myGraph) {
		System.out.println("EDGE\tConnrctions");
		for(int i=0;i<myGraph.vertex;i++) {
			System.out.print(i+1 +"\t");
			for(int connection: myGraph.network[i]) {
				System.out.print("->"+(connection+1));
			}
			System.out.println();
		}
	}

	private static void addVertexEdge(DemoGraph myGraph, int startEdge, int endEdge) {
		
		myGraph.network[startEdge].add(endEdge);
		myGraph.network[endEdge].add(startEdge);
	}

}
