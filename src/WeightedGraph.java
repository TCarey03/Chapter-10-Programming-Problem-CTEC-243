import java.util.ArrayList;

public class WeightedGraph<T> {
    private ArrayList<T> vertices;
    private int[][] matrix;

    public WeightedGraph(int size) {
        vertices = new ArrayList<>();
        matrix = new int[size][size];

        // -1 means no connection
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = -1;
            }
        }
    }

    // Add a vertex (city)
    public void addVertex(T vertex) {
        if (vertices.size() < matrix.length) {
            vertices.add(vertex);
        } else {
            System.out.println("Graph is full!");
        }
    }

    // Add a weighted edge (route)
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
                    System.out.print(vertices.get(j) +
                            "(" + matrix[i][j] + ") ");
                }
            }

            System.out.println();
        }
    }
}
