package DSA;

import java.util.ArrayList;
import java.util.List;
public class TestDFS {

    public static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                dfs(neighbor, visited, graph);
            }
        }
    }

    public static void main(String[] args) {

        int v = 5;

        List<List<Integer>> graph = new ArrayList<>();

        // Create 5 empty lists
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(0).add(3);
        graph.get(0).add(4);

        // Visited array
        boolean[] visited = new boolean[v];

        // Start DFS from node 0
        dfs(0, visited, graph);
    }
}