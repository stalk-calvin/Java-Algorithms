# Six Degrees of Kevin Bacon

## Problem

The game "Six Degrees of Kevin Bacon" involves trying to find the shortest connection between an arbitrarily selected actor and Kevin Bacon. Two actors are linked if they appeared in the same movie. The goal of the game is to connect the given actor to Kevin Bacon using the fewest possible links.

Given a list of all major movies in history and their casts(assume that the names of movies and actors are unique identifiers), describe a data structure that could be constructed to efficiently solve Kevin Bacon problems.

Write a routine that uses your data structure to determine the Bacon number(the minimum number of links needed to connect Kevin Bacon) for any actor.

## Analysis

The data structure we need seem to involve nodes(actors) and links(movies),but it's a little more complicated than the tree structures we've been working with up to this point.
For one thing, each node may be linked to an arbitrarily large number of other nodes. There's no restriction on which nodes may have links to each other, so it's expected that some sets of links will form cycles(circular connections). Finally, there's no hierahical relationship between the nodes on either side of a link.
These requirements point toward using a very general data structure: an undirected graph.

### How to represent the actor and movies?

Use an object to represent each node(actor).
Edges are often implemented using references(or pointers), which are inheretly unidirectional: there's generally no way for an object to determine what is referencing it. The simplest way to implement the undirected edges we need here is to have each node object reference the other.
Use of `Set` to hold the reference to other nodes for an unlimited number of edges and prevent duplicates.

### How to find the shorest connection between an arbitrarily actor and Kevin Bacon?

The question is reduced to finding the length of the shorest path between the given node and the "Kevin Bacon" node.
Finding this path involves searching across the graph.

`Depth-first searchs` have simple recursive implementations - would that approach work here?

In a depth-first search, we repeatedly follow the first edge of each node we encounter until we can go no further, then backtrack until find a node with an untraversed edge, follow that path as far as we can, and so on.

One challenge we face immediately is that unlike a tree, where every path eventually terminates in a leaf node, forming an obvious base case for recursion, in a graph there may be cycles, so we need to be careful to avoid endless recursion.(In this graph, where edges are implemented with pairs of reference, each edge effectively forms a cycle between the two nodes it connects, so there are a large number of cycles.)

### How to avoid endlessly circling through cycle?

If a node has already visited, we shouldn't visit it again.
One way to keep track of whether a node has been visited is to change a variable on the node object to mark it as visited.
Another is to use a separate data structure to track all the nodes that have been visited. Then the recursive base case is a node with no adjacent(directly connected by an edge) unvisited nodes.
That's provides a means to search through all the (connecte) nodes of the graph, but does it help solve the problem?

It's not difficult to track the number of edges traversed from the starting node - this is just the recursion level. When we find the target node, the current recursion level gives us the number of edges traversed along the path we traveled to this node.
But we need the number of edges(links) along the  `shorest` path, not just any path.
That seems doesn't work.

Ideally, we want a search algorithm that encounters each node along the shortest path from the starting node. If we extend the search outward fromthe starting node in all direction, extending each search path one edge at a time, then each time we encounter a node, it will be via the shorest path to that node. This is a descriptionj of a `breadth-first-search`.

Does it will always find nodes along the shortest path?
When we encounter an unvisited node while searching ar n edges from the start node, all the nodes that are `n-1` or ferwe edges from the start have already been visited, so the shortest path to this node must involve `n` edges.
(If you're thinking that this seems simpler than what you remember for the algorithm for finding the shortest path between two nodes in a graphm you may be thinking of `Dijkstra's algorithm`. Dijkstra's algorithm, which is somewhat more complex, finds the shortest path when each edge is assigned a weight, or length, so the shortest path is not necessarily the path with the fewest edges. Breadth-first search is sufficient for finding the shortest path when the edges have no [or
equal] weights, such as in this problem)


