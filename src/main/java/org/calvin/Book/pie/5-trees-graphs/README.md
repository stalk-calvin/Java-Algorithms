# Trees and Graphs

Trees and graphs are common data structures, so both are fair game in a programming interview.

Tree problems are more common, howerver, because they are simple enough to implement within the time constraints of an interview and enable an interviewer to test your understanding of recursion and runtime analysis.
Graph probelms are interesting but often more complicated.

## Trees

A tree is moade up of nodes(data elements) with zero, one, or several reference(or pointers) to other nodes.

    public abstract class Node {
        private Nde[] childeren;
        public Node(Node[] children) {
            this.children = children;
        }

        public int getNumChildren() {
            return children.length;
        }

        public Node getChild(int index) {
            return children[index];
        }
    }

    public class IntNode extends Node {
        private int value;

        public IntNode(Node[] children, int value) {
            supper(children);
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }

### Binary Trees

Each node has no more than two children, referred to as left and right.

    public class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public Node getLeft() { return left; }
        public Node getRight() { return right; }
        public Node getValue() { return value; }
    }

When an element has no left or right child, the corresponding reference is null.

__Note__: If an interviewer says "tree", it's a good idea to clarify whether he/she is referring to a generic tree or a binary tree.

### Binary Search Trees

Trees are often used to store sorted or ordered data.
The most common way to store ordered data in a tree is to use a special tree called a `binary search tree(BST)`.
In a BST, the value held by a node's left child is less than or equal to its own value, and the value held by a node's right child is greater than or equal to its value.(left<=root<=right)

__Note__: BSTs are so common that many people mean a BST when they say "tree". Agsin, ask for clarification before proceeding.

One advantafe of a binary search tree is that the lookup operation(locating a paricular node in the tree) is fast and simple.

    Node findNode(Node root, int value) {
        while(root != null) {
            int currval = root.getValue();
            if (currval == value) break;
            if (currval < value) {
                root = root.getRight();
            } else {
                root = root.getLeft;
            }
        }
        return root;
    }

__Note__: Lookup is an O(log(n)) operation in a balanced binary search tree.

Loup is is only O(log(n)) if you can guarantee that the number of nodes remaining to be searched will be halved or nearly halved on each iteration.
In worst case, each node has only onechild, in which case you end up with a linked list and lookup becomes an O(n) operation.

__Nore__: Deletion and insertion are O(log(n)) operations in binary search trees.

Binary search trees have other important properties.
For example. you can obtain the smallest element by following all the left children and the largest element by following all the right children.
The nodes can also be printed out, in order, in O(n) time.
Given a node, you can even find the next highest node in O(log(n)) time.

Tree problems are often designed to test your ability to think recursively.

For example, thepreceding lookup operation can be reimplemented recusivly as follows:

    Node findNode(Node root, int value) {
        if (root == null) return null;
        int currval = root.getValue();
        if (currval == value) return root;
        if (currval < vlaue) {
            return findNode(root.getRight(), value);
        } else {
            return finNode(root.getLift(), value);
        }
    }

__Note__: Many tree operations can be implemented recursively. The recursive implementation may not be the most efficient, but it's usually the best place to start.

### Heaps

Another common tree is a `heap`.

Heaps are trees(usually binary trees) where (in a `max-heap`) each child of a node has a value less than or equal to the node's own value.(In a `min-heap`, each child is greater than or equal to its parent).
Consquently, the root node always has the largest value in the tree, which means that you can find the maximum value in constant time: simply return the root value.
Insertion and deletion are still O(log(n)), but lookup becomes O(n). You can fin the next higher node to a given node in O(log(n)) time or print out the nodes in sorted order in O(n) time as in a BST.
Although conceptually heaps are trees, the underlying data implementation of a heap often differs form the trees in precedding discussion.

__Note__: If extracting the max value needs to be fast, use a heap.

### Common Searches

#### Breadth-First Search(BFS)

In a BFS you start with the root, move left to right across the second level, then move left to right across the third level, and so forth.
A BFS uses additional memory becuae it is necessary to track the child nodes for all nodes on a given level while searching that level.

#### Depth-First Search(DFS)

A depth-first search follows one branch of the tree down as many levels as possible until the target node is found or the end is reached.
When the search can't go down any farther, it is continued at the nearest ancestor with unexplored children.

DFS has much lower memeory requirement than BFS because it is not neccssary to store all the child pointers at each level.
If your node is likely to be in the upper levels of the tree, BFS is more efficient.
If the target node is likely to be in the lower levels of the tree, DFS has the advantage that it doesn't examine any single level last.(BFS always examines the lowerest level last).

### Traversals

A `traversal` is just like a search, except that instead of stopping when you find a particular target node, you visist every node in the tree.

Three most common types of depth-first traversals for binary tree.

* __Preorder__ - A node is always visited before any of its children.
* __Inorder__ - The left subtree is visit first, then the node itself, and then the node's right subtree.
* __Postorder__ - A node is always visited after all its children.

__Note__: If you're asked to implement a traversal, recursion is a good way to start thinking about the problem.

## Graph

Graphs are more genral and complex than trees. Like trees, they consist of nodes with childrem - a tree is actually a special case of a graph.
But unlike tree nodes, graph nodes(or vertices) can have multiple "parents", possibly creating a loop(a cycle). In addition, the links between nodes, as well as the nodes themselves, may have values or weights. These links are called `edges` because they may contain more information than just a pointer.
A graph with one-way edges is called `directed graph`.
A graph with only two-way pointers is called an `undirected graph`.


Graphs are commonly used to model real-world problems that are difficult to model with other data structure.

There are several common ways to respresent graph data structure.
One common representation has the data structure for each node include an `adjacency list`: a list of references to other nodes with which the node shares edges. This list is analogous to the child references of the tree node data structure, but the adjacency list is usually a dynamic data structure since the number of edges at each node can vary over a wide rane.
Another graph representation is an `adjacency matrix`, which is a square matrix with dimension equal to the number of nodes. The matrix element at position i, j represents the number of edges extending from node i to node j.

All the types of searches possible in trees have analogs in graphs. The graph equivalents are usually slightly more complex due to the possibility of cycles.

## Tree and Graph Problems

|No.|Title|Solution|
|---|-----|--------|
|5.1|[Height of a tree](height-of-tree)|[Java](heiht-of-tree/HeightOfTree.java)|
|5.2|[Preorder Traversal](preorder-traversal)|[Java](preorder-traversal/PreorderTraversal.java)|
|5.3|[Preorder Traversal, No Recursion](preorder-traversal-no-recursion)|[Java](preorder-traversal-no-recursion/PreorderTraversalNoRecursion.java)|
|5.4|[Lowest Common Ancestor](lowest-common-ancestor)|[Java](lowest-common-ancestor/LowestCommonAncestor.java)|
|5.5|[Binary Tree to Heap](binary-to-heap)|[Java](binary-to-heap/BinaryToHeap.java)|
|5.6|[Unbalanced Binary Search Tree](unbalanced-tree)|[Java](unbalanced-bst/UnbalancedBST.java)|
|5.7|[Six Degree of Kevin Bacon](six-degrees)|[Java](six-degrees/SixDegrees.java)|
