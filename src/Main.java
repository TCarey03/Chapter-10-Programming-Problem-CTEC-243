public class Main {
    public static void main(String[] args) {

        WeightedGraph<String> graph = new WeightedGraph<>(6);

        // Add six cities
        graph.addVertex("New York");
        graph.addVertex("Chicago");
        graph.addVertex("Denver");
        graph.addVertex("Los Angeles");
        graph.addVertex("Seattle");
        graph.addVertex("Miami");

        // Add routes with fuel costs
        graph.addEdge("New York", "Chicago", 790);
        graph.addEdge("New York", "Miami", 1300);
        graph.addEdge("Chicago", "Denver", 1000);
        graph.addEdge("Denver", "Los Angeles", 830);
        graph.addEdge("Denver", "Seattle", 1300);
        graph.addEdge("Los Angeles", "Seattle", 1150);
        graph.addEdge("Miami", "Chicago", 1380);

        // Display the graph
        graph.displayGraph();

        // Test BFS connectivity
        System.out.println("\nBFS Connectivity Tests:");

        System.out.println("New York to Los Angeles: "
                + graph.bfs("New York", "Los Angeles"));

        System.out.println("New York to Miami: "
                + graph.bfs("New York", "Miami"));

        System.out.println("Seattle to Miami: "
                + graph.bfs("Seattle", "Miami"));
    }
}
