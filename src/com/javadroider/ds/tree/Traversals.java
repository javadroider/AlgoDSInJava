package com.javadroider.ds.tree;

import java.util.Stack;

public class Traversals {

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node);
            inOrder(node.right);
        }
    }

    public void preOrderIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        while (true) {
            while (node != null) {
                stack.push(node);
                System.out.print(node);
                node = node.left;
            }

            if (stack.empty()) {
                break;
            }

            node = stack.pop();
            node = node.right;
        }
    }

    public void inOrderIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        while (true) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (stack.empty()) {
                break;
            }

            node = stack.pop();
            System.out.print(node);
            node = node.right;
        }

    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node);
        }
    }

    /*
              10
            /   \
           8     12
          / \   /  \
         7  9  11  13
    */

    public static void main(String[] args) {
        Node head = BinaryTree.sample();

        Traversals traversals = new Traversals();
        System.out.print("INORDER ");
        traversals.inOrder(head);
        System.out.println();
        System.out.print("INORDER ITERATIVE ");
        traversals.inOrderIterative(head);
        System.out.println();
        System.out.print("PREORDER ");
        traversals.preOrder(head);
        System.out.println();
        System.out.print("PREORDER ITERATIVE ");
        traversals.preOrderIterative(head);

        System.out.println();
        System.out.print("POSTORDER ");
        traversals.postOrder(head);

        System.out.println();
        System.out.print("POSTORDER ITERATIVE ");
       // traversals.postOrderIterative(head);


    }

    private void postOrderIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        while (true) {

            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.empty()) {
                    break;
                } else if (stack.peek().right == null) {
                    node = stack.pop();
                    System.out.print(" " + node);

                    if (node == stack.peek().right) {
                        System.out.print(" " + stack.peek());
                        stack.pop();
                    }
                }
                if (!stack.empty()) {
                    node = stack.peek().right;
                } else {
                    node = null;
                }
            }
        }
    }
}
