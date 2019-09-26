class Node<T> {
    private Node<T> left;
    private Node<T> right;
    private T       value;

    public Node(T value) {
        this.value = value;
    }

    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node<T> getLeft() { return left; }
    public Node<T> getRight() { return right; }
    public T getValue() { return value; }
}

public class HeightOfTree<T> {
    public int treeHeight(Node<T> root) {
        if (root == null) return 0;
        return 1 + Math.max(treeHeight(root.getLeft()),
                            treeHeight(root.getRight()));
    }

    public static void main(String[] args) {
        HeightOfTree<Integer> sol = new HeightOfTree<Integer>();

        Node<Integer> left = new Node<Integer>(
                                new Node<Integer>(4),
                                new Node<Integer>(5),
                                2
                            );
        Node<Integer> right = new Node<Integer>(3);
        Node<Integer> root = new Node<Integer>(left, right, 3);

        int height = sol.treeHeight(root);
        System.out.println(height);
    }
}
