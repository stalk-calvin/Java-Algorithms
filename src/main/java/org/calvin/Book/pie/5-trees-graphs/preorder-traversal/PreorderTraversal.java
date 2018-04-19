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
    public void printValue() {
        System.out.print(value + " ");
    }
}

public class PreorderTraversal<T> {
    void preorderTraversal(Node<T> root) {
        if (root == null) return;
        root.printValue();
        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }

    void inorderTraversal(Node<T> root) {
        if (root == null) return;
        inorderTraversal(root.getLeft());
        root.printValue();
        inorderTraversal(root.getRight());
    }

    void postorderTraversal(Node<T> root) {
        if (root == null) return;
        postorderTraversal(root.getLeft());
        postorderTraversal(root.getRight());
        root.printValue();
    }

    public static void main(String[] args) {
        PreorderTraversal<Integer> sol = new PreorderTraversal<Integer>();
        Node<Integer> root = new Node<Integer>(
                                new Node<Integer>(
                                    new Node<Integer>(25),
                                    new Node<Integer>(75),
                                    50
                                ),
                                new Node<Integer>(
                                    new Node<Integer>(
                                        new Node<Integer>(110),
                                        null,
                                        125),
                                    new Node<Integer>(175),
                                    150
                                ),
                                100
                            );
        System.out.println("==== preorder traversal ====");
        sol.preorderTraversal(root);
        System.out.println("\n==== inorder traversal ====");
        sol.inorderTraversal(root);
        System.out.println("\n==== inorder traversal ====");
        sol.postorderTraversal(root);
        System.out.println();
    }
}

