import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() { return left; }
    public void setLeft(Node left) { this.left = left; }

    public Node getRight() { return right; }
    public void setRight(Node right) { this.right = right; }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
}

public class BinaryToHeap {

    public Node heapifyBinaryTree(Node root) {
        int size = traverse(root, 0, null); // count nodes

        Node[] nodeArray = new Node[size];
        traverse(root, 0, nodeArray); // load nodes into array

        Arrays.sort(nodeArray, new Comparator<Node>() {
                @Override
                public int compare(Node m, Node n) {
                    return m.getValue() - n.getValue();
                }
            });

        for (int i = 0; i < size; i++) {
            int left = 2 * i + 1;
            int right = left + 1;
            nodeArray[i].setLeft(left >= size ? null : nodeArray[left]);
            nodeArray[i].setRight(right>= size ? null : nodeArray[right]);
        }
        return nodeArray[0];
    }

    public int traverse(Node node, int count, Node[] arr) {
        if (node == null)
            return count;
        if (arr != null)
            arr[count] = node;
        count++;
        count = traverse(node.getLeft(), count, arr);
        count = traverse(node.getRight(), count, arr);
        return count;
    }

    public static void printNodes(Node root) {
        Node curr = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(curr);
        while (!queue.isEmpty()) {
            curr = queue.remove();
            System.out.print(curr.getValue() + " ");
            if (curr.getLeft() != null) {
                queue.add(curr.getLeft());
            }
            if (curr.getRight() != null) {
                queue.add(curr.getRight());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryToHeap sol = new BinaryToHeap();
        Node root = new Node(2,
                        new Node(4,
                            new Node(0,
                                new Node(1),
                                new Node(7)
                            ),
                            new Node(5,
                                new Node(3),
                                new Node(8)
                            )
                        ),
                        new Node(6)
                    );
        System.out.println("==== origin binary tree ====");
        printNodes(root);
        Node heap = sol.heapifyBinaryTree(root);
        System.out.println("==== heapify binary tree ====");
        printNodes(heap);
    }
}

