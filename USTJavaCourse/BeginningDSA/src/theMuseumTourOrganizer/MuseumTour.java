package theMuseumTourOrganizer;

import java.util.*;

public class MuseumTour {
    private int[][] adjacencyMatrix;
    private List<Exhibit> exhibits;

    public MuseumTour(int numberOfExhibits) {
        adjacencyMatrix = new int[numberOfExhibits][numberOfExhibits];
        exhibits = new ArrayList<>();
    }

    public void addExhibit(String name, int id) {
        exhibits.add(new Exhibit(name, id));
    }

    public void setDistance(int fromId, int toId, int distance) {
        adjacencyMatrix[fromId][toId] = distance;
        adjacencyMatrix[toId][fromId] = distance; // Assuming the graph is undirected
    }

    public void displayExhibits() {
        System.out.println("Exhibits in the Museum:");
        for (Exhibit exhibit : exhibits) {
            System.out.println(exhibit);
        }
    }

    public void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        int i=0;
   
        for (int[] row : adjacencyMatrix) {
            System.out.println(i+++""+Arrays.toString(row));
        }
    }

    public void findShortestPath(int startId, List<Integer> desiredIds) {
        // Run Dijkstra's algorithm
        int n = exhibits.size();
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];
        int[] previous = new int[n];

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(previous, -1);

        distances[startId] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // Min-heap
        pq.offer(new int[]{startId, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            if (visited[currentNode]) continue;
            visited[currentNode] = true;

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (adjacencyMatrix[currentNode][neighbor] > 0 && !visited[neighbor]) {
                    int newDist = currentDistance + adjacencyMatrix[currentNode][neighbor];
                    if (newDist < distances[neighbor]) {
                        distances[neighbor] = newDist;
                        previous[neighbor] = currentNode;
                        pq.offer(new int[]{neighbor, newDist});
                    }
                }
            }
        }

        // Compute the total tour distance for desired exhibits
        int totalDistance = 0;
        List<String> tourSequence = new ArrayList<>();
        for (int exhibitId : desiredIds) {
            totalDistance += distances[exhibitId];
            tourSequence.add(exhibits.get(exhibitId).name);
        }

        System.out.println("Shortest Tour Sequence: " + tourSequence);
        System.out.println("Total Tour Time: " + totalDistance + " minutes");
    }
}

