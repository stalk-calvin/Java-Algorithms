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
    public Node getRight() { return right; }
    public int getValue() { return value; }

    public void setLeft(Node left) { this.left = left; }
    public void setRight(Node right) { this.right = right; }
    public void setValue(int value) { this.value = value; }
}

public class UnbalancedBST {

    public Node rotateRight(Node oldRoot) {
        Node newRoot = oldRoot.getLeft();
        oldRoot.setLeft(newRoot.getRight());
        newRoot.setRight(oldRoot);
        return newRoot;
    }
    
    public static void printBinaryTree(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        Node curr = root;
        queue.add(curr);
        while (!queue.isEmpty()) {
            curr = queue.remove();
            System.out.print(curr.getValue() + " ");
            if (curr.getLeft() != null) { queue.add(curr.getLeft()); }
            if (curr.getRight() != null) { queue.add(curr.getRight()); }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnbalancedBST sol = new UnbalancedBST();

        Node root = new Node(6,
                        new Node(4,
                            new Node(2,
                                new Node(1),
                                new Node(3)
                            ),
                            new Node(5)
                        ),
                        new Node(7)
                    );
        printBinaryTree(root);

        Node newRoot = sol.rotateRight(root);
        printBinaryTree(newRoot);
    }
}
