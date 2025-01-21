package graphs;

import java.util.*;

public class DepthFirstSearch {
    private Map<Integer, List<Integer>> adjList; // Adjacency list to store the graph

    // Constructor to initialize the graph
    public DepthFirstSearch() {
        adjList = new HashMap<>();
    }

    public static void main(String[] args) {
        DepthFirstSearch graph = new DepthFirstSearch();

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        System.out.println("DFS (Recursive):");
        graph.dfsRecursive(0, new HashSet<>());

        System.out.println("\nDFS (Iterative):");
        graph.dfsIterative(0);
    }
    
    // Method to add an edge (undirected graph)
    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Depth First Search (Recursive)
    public void dfsRecursive(int start, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(start);
        System.out.print(start + " ");

        // Recursively visit all unvisited neighbors
        for (int neighbor : adjList.getOrDefault(start, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    // Depth First Search (Iterative)
    public void dfsIterative(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                // Push all unvisited neighbors to the stack
                for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}



