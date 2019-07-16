package org.calvin.Tree;

class BinarySearchTree {

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void delete(int key) {
        deleteRec(root, key);
    }

    Node deleteRec(Node node, int key) {
        if (node==null) {
            return null;
        } else if (node.key < key) {
            node.right = deleteRec(node.right, key);
        } else if (node.key > key) {
            node.left = deleteRec(node.left, key);
        } else {
            // when one side is null
            if (node.left == null) {
                return node.left;
            } else if (node.right == null) {
                return node.right;
            }
            // when both not empty, we have to recurse
            else {
                //search the min node
                node.key = minValue(node);
                node.right = deleteRec(node.right, node.key);
            }
        }
        return node;
    }

    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        t.insert(10);
        t.insert(6);
        t.insert(18);
        t.insert(4);
        t.insert(8);
        t.insert(15);
        t.insert(21);

        t.inorder();

        t.insert(17);

        t.inorder();

        t.delete(8);

        t.inorder();
    }
}