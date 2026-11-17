import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class WeightedGraph<T> {

    private ArrayList<T> vertices;
    private int[][] matrix;

    // Constructor
    public WeightedGraph(int size) {
        vertices = new ArrayList<>();
        matrix = new int[size][size];

        // -1 represents no connection
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = -1;
            }
        }
    }

    // Phase 1: Add a vertex
    public void addVertex(T vertex) {

        if (vertices.size() < matrix.length) {
            vertices.add(vertex);
        } else {
            System.out.println("Graph is full!");
        }
    }

    // Phase 1: Add a weighted edge
    public void addEdge(T from, T to, int weight) {

        int fromIndex = vertices.indexOf(from);
        int toIndex = vertices.indexOf(to);

        if (fromIndex == -1 || toIndex == -1) {
            System.out.println("City not found!");
            return;
        }

        matrix[fromIndex][toIndex] = weight;
        matrix[toIndex][fromIndex] = weight;
    }

    // Display the graph
    public void displayGraph() {

        System.out.println("Weighted Graph:");

        for (int i = 0; i < vertices.size(); i++) {

            System.out.print(vertices.get(i) + ": ");

            for (int j = 0; j < vertices.size(); j++) {

                if (matrix[i][j] != -1) {
                    System.out.print(vertices.get(j)
                            + "(" + matrix[i][j] + ") ");
                }
            }

            System.out.println();
        }
    }

    // Phase 2: Breadth-First Search (BFS)
    public boolean bfs(T startVertex, T endVertex) {

        int start = vertices.indexOf(startVertex);
        int end = vertices.indexOf(endVertex);

        if (start == -1 || end == -1) {
            return false;
        }

        boolean[] visited = new boolean[vertices.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.remove();

            if (current == end) {
                return true;
            }

            for (int i = 0; i < vertices.size(); i++) {

                if (matrix[current][i] != -1 && !visited[i]) {

                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return false;
    }

    // Phase 3: Depth-First Search (DFS)
    public boolean dfs(T startVertex, T endVertex) {

        int start = vertices.indexOf(startVertex);
        int end = vertices.indexOf(endVertex);

        if (start == -1 || end == -1) {
            return false;
        }

        boolean[] visited = new boolean[vertices.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            int current = stack.pop();

            if (current == end) {
                return true;
            }

            if (!visited[current]) {

                visited[current] = true;

                for (int i = 0; i < vertices.size(); i++) {

                    if (matrix[current][i] != -1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }

        return false;
    }
}
