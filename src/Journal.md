## Phase 1: Building the Network

I chose an adjacency matrix because it makes it easy to store and find connections between a small number of cities. It also allows us to store the fuel cost for each route. An adjacency list could save memory, but an adjacency matrix is simpler for a small network.

------------

## Phase 2: Connectivity Check (BFS)

BFS uses a Queue to explore neighboring cities one level at a time. The first city added to the queue is the first one checked. This helps the program search through the graph in an organized way until it finds the destination or runs out of connected cities.

------------

## Phase 3: Path Exploration (DFS)

The main difference between BFS and DFS is the data structure they use. BFS uses a Queue, which follows First-In, First-Out and explores neighboring vertices level by level. DFS uses a Stack, which follows Last-In, First-Out and explores one path as far as possible before backtracking. Both algorithms can determine if two cities are connected.

------------

## Phase 4: Validation & Reflection

During testing, I checked different graph situations to make sure BFS and DFS worked correctly. I tested connected cities, disconnected cities, and a graph with only two connected cities. Both algorithms correctly found paths when connections existed and returned false when no path existed. One thing I learned is that BFS and DFS can explore graphs differently but still find the same connectivity results. Testing helped me understand how queues, stacks, and adjacency matrices work together.