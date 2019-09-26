class Node {
    Node left;
    Node right;
    int  value;

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
}

public class LowestCommonAncestor {

    Node findLowestCommonAncestor(Node root, Node child1, Node child2) {
        if (root == null || child1 == null || child2 == null) {
            return null;
        }
        int value1 = child1.getValue();
        int value2 = child2.getValue();
        int value;
        Node curr = root;
        while (curr != null) {
            value = curr.getValue();
            if (value > value1 && value > value2) {
                curr = curr.getLeft();
            } else if (value < value1 && value < value2) {
                curr = curr.getRight();
            } else {
                return curr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LowestCommonAncestor sol = new LowestCommonAncestor();

        Node child1 = new Node(4);
        Node child2 = new Node(14);
        Node root = new Node(
                        20,
                        new Node(
                            8,
                            child1, // 4
                            new Node(
                                12,
                                new Node(10),
                                child2 // 14
                            )
                        ),
                        new Node(22)
                    );
        
        Node result = sol.findLowestCommonAncestor(root, child1, child2);
        System.out.println(result.getValue());
    }
}

