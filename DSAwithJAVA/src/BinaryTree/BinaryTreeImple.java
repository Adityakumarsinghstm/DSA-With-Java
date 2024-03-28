package BinaryTree;

import java.util.function.BinaryOperator;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key= k;
    }

    void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.println(root.key+" " );
            inOrder(root.right);
        }
    }
}
public class BinaryTreeImple {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.inOrder(root);

    }
}
