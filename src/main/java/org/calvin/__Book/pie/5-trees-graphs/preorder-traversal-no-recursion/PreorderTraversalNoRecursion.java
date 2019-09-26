import java.util.Stack;

class Node<T> {
    private Node<T> left;
    private Node<T> right;
    private T       value;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
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

public class PreorderTraversalNoRecursion<T> {

    void preorderTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        Node<T> curr = root;
        while (curr != null) {
            // visit current node first
            curr.printValue();
            // push right node
            if (curr.getRight() != null) { stack.push(curr.getRight()); }
            // vist left
            curr = curr.getLeft();
            // if no left, vist right
            if (curr == null && stack.size() > 0) { 
                curr= stack.pop();
            }
        }
    }

    /**
     * Preorder traversal: push all nodes onto the stack to avoid codeing seperate cases for the left and right children.
     */
    void preorderTraversal2(Node<T> root) {
        if (root == null) return;
        Stack<Node<T>> stack = new Stack<Node<T>>();
        Node<T> curr;
        stack.push(root);
        while (stack.size() > 0) {
            // visit root
            curr = stack.pop();
            curr.printValue();
            // push right
            Node<T> n = curr.getRight();
            if (n != null) { stack.push(n); }
            // push left
            n = curr.getLeft();
            if (n != null) { stack.push(n); }
        }
    }

    void inorderTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        Node<T> curr = root;
        while (curr != null) {
            if (curr.getLeft() != null) {
                stack.push(curr);
                curr = curr.getLeft();
            } else {
                // vist left
                curr.printValue();
                while (stack.size() > 0) {
                    // vist root or right
                    curr = stack.pop();
                    curr.printValue();
                    // check right subtree
                    curr = curr.getRight();
                    if (curr != null) {
                        if (curr.getLeft() != null) {
                            break; // iterate left subtree
                        } else {
                            stack.push(curr);
                        }
                    }
                }
            }
        }
    }

    void postorderTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        Node<T> curr = root;
        Node<T> n;
        while (curr != null) {
            if (curr.getLeft() != null) {
                stack.push(curr);
                curr = curr.getLeft();
            } else {
                // vist left
                curr.printValue();
                while (stack.size() > 0) {
                    // check the right subtree
                    n = stack.peek().getRight();
                    if (n != null && n != curr) {
                        // not visted right subtree
                        curr = n;
                        break;
                    }
                    // vist root or right
                    curr = stack.pop();
                    curr.printValue();
                }
                // end at root
                if (curr == root) { break; }
            }
        }
    }

    public static void main(String[] args) {
        PreorderTraversalNoRecursion<Integer> sol = new PreorderTraversalNoRecursion<Integer>();
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
        System.out.println();
        sol.preorderTraversal2(root);
        System.out.println();
        System.out.println("==== inorder traversal ====");
        sol.inorderTraversal(root);
        System.out.println();
        System.out.println("==== postorder traversal ====");
        sol.postorderTraversal(root);
        System.out.println();
    }
}

