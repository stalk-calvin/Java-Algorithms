package org.calvin.__Book.breakaway;

/**
 * Created by jananiravi on 12/13/15.
 */
public class BinaryTreeIsBST {

    public static void main(String[] args) {
        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);
        Node<Integer> ten = new Node<>(10);
        Node<Integer> eleven = new Node<>(11);

        Node<Integer> head = insert(null, five);

        insert(head, six);
        insert(head, one);
        insert(head, seven);
        insert(head, nine);
        insert(head, four);
        insert(head, three);
        insert(head, eight);
        insert(head, two);

        eight.setRightChild(eleven);

        System.out.println("Is BST: " + isBinarySearchTree(head, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }


    public static Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        if (head == null) {
            return node;
        }

        if (node.getData() <= head.getData()) {
            head.setLeftChild(insert(head.getLeftChild(), node));
        } else {
            head.setRightChild(insert(head.getRightChild(), node));
        }

        return head;
    }

    public static boolean isBinarySearchTree(Node<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.getData() <= min || root.getData() > max) {
            return false;
        }

        return isBinarySearchTree(root.getLeftChild(), min, root.getData())
                && isBinarySearchTree(root.getRightChild(), root.getData(), max);
    }


    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }

}
