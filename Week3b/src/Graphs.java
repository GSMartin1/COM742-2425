import java.util.*;

public class Graphs {
    public static void main(String[] args) {
        // Creating the graph as an adjacency list
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('A', 'D', 'E'));
        graph.put('C', Arrays.asList('A', 'F', 'G'));
        graph.put('D', Arrays.asList('B'));
        graph.put('E', Arrays.asList('B', 'H'));
        graph.put('F', Arrays.asList('C'));
        graph.put('G', Arrays.asList('C'));
        graph.put('H', Arrays.asList('E'));

        // Perform BFS starting from node 'A'
        System.out.println("BFS Traversal starting from A:");
        graphs(graph, 'A');
    }

    public static void graphs(Map<Character, List<Character>> graph, char startNode) {
        Set<Character> visited = new HashSet<>(); // To track visited nodes
        Queue<Character> queue = new LinkedList<>(); // Queue for BFS traversal

        queue.add(startNode); // Start BFS from the given node

        while (!queue.isEmpty()) {
            char node = queue.poll(); // Dequeue the front node

            if (!visited.contains(node)) {
                System.out.print(node + " "); // Process the node
                visited.add(node); // Mark node as visited

                // Enqueue all unvisited neighbors
                for (char neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}