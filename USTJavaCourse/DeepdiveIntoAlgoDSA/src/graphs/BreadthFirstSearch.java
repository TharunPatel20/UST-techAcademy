package graphs;

import java.util.*;

public class BreadthFirstSearch {
    private Map<Integer, List<Integer>> adjList; // Adjacency list for the graph

    // Constructor to initialize the graph
    public BreadthFirstSearch() {
        adjList = new HashMap<>();
    }
    
    public static void main(String[] args) {
        BreadthFirstSearch graph = new BreadthFirstSearch();

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Perform BFS starting from node 0
        graph.bfs(0);
    }

    // Method to add an edge (undirected graph)
    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // For undirected graph
    }

    // Breadth First Search (BFS) implementation
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>(); // Set to track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS traversal

        // Add the starting node to the queue and mark it as visited
        queue.add(start);
        visited.add(start);

        System.out.println("BFS Traversal starting from node " + start + ":");

        while (!queue.isEmpty()) {
            int node = queue.poll(); // Dequeue a node
            System.out.print(node + " "); // Process the node

            // Enqueue all unvisited neighbors
            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor); // Mark as visited
                    queue.add(neighbor); // Add to the queue
                }
            }
        }
        System.out.println(); // Newline after traversal
    }
}
