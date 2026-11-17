public class Main {

    public static void main(String[] args) {

        // Create the main graph
        WeightedGraph<String> graph = new WeightedGraph<>(6);

        // Add six cities
        graph.addVertex("New York");
        graph.addVertex("Chicago");
        graph.addVertex("Denver");
        graph.addVertex("Los Angeles");
        graph.addVertex("Seattle");
        graph.addVertex("Miami");

        // Add weighted routes
        graph.addEdge("New York", "Chicago", 790);
        graph.addEdge("New York", "Miami", 1300);
        graph.addEdge("Chicago", "Denver", 1000);
        graph.addEdge("Denver", "Los Angeles", 830);
        graph.addEdge("Denver", "Seattle", 1300);
        graph.addEdge("Los Angeles", "Seattle", 1150);
        graph.addEdge("Miami", "Chicago", 1380);

        // Display network
        graph.displayGraph();

        // Phase 2: BFS tests
        System.out.println("\nBFS Tests:");

        System.out.println("New York to Los Angeles: "
                + graph.bfs("New York", "Los Angeles"));

        System.out.println("New York to Miami: "
                + graph.bfs("New York", "Miami"));

        System.out.println("Seattle to Miami: "
                + graph.bfs("Seattle", "Miami"));

        // Phase 3: DFS tests
        System.out.println("\nDFS Tests:");

        System.out.println("New York to Los Angeles: "
                + graph.dfs("New York", "Los Angeles"));

        System.out.println("New York to Miami: "
                + graph.dfs("New York", "Miami"));

        System.out.println("Seattle to Miami: "
                + graph.dfs("Seattle", "Miami"));

        // Phase 4: Disconnected graph
        System.out.println("\nDisconnected Graph Test:");

        WeightedGraph<String> disconnected =
                new WeightedGraph<>(3);

        disconnected.addVertex("Dallas");
        disconnected.addVertex("Houston");
        disconnected.addVertex("Boston");

        disconnected.addEdge("Dallas", "Houston", 240);

        System.out.println("Dallas to Houston BFS: "
                + disconnected.bfs("Dallas", "Houston"));

        System.out.println("Dallas to Boston BFS: "
                + disconnected.bfs("Dallas", "Boston"));

        System.out.println("Dallas to Boston DFS: "
                + disconnected.dfs("Dallas", "Boston"));

        // Phase 4: Two-city graph
        System.out.println("\nTwo-City Graph Test:");

        WeightedGraph<String> twoCities =
                new WeightedGraph<>(2);

        twoCities.addVertex("Austin");
        twoCities.addVertex("San Antonio");

        twoCities.addEdge("Austin", "San Antonio", 80);

        System.out.println("Austin to San Antonio BFS: "
                + twoCities.bfs("Austin", "San Antonio"));

        System.out.println("Austin to San Antonio DFS: "
                + twoCities.dfs("Austin", "San Antonio"));
    }
}
