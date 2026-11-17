## Phase 1: Building the Network

I chose an adjacency matrix because it makes it easy to store and find connections between a small number of cities. It also allows us to store the fuel cost for each route. An adjacency list could save memory, but an adjacency matrix is simpler for a small network.

------------

## Phase 2: Connectivity Check (BFS)

BFS uses a Queue to explore neighboring cities one level at a time. The first city added to the queue is the first one checked. This helps the program search through the graph in an organized way until it finds the destination or runs out of connected cities.