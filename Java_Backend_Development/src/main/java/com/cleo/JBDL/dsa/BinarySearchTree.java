package com.cleo.JBDL.dsa;
// Java program for
// Sum of alternate leaf nodes in bst
/*class Node
{
    public int data;
    public Node left, right;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/
public class BinarySearchTree
{
    public Node root;
    private static boolean alternate;
    public BinarySearchTree()
    {
        this.root = null;
        this.alternate = false;
    }
    // Insert a new node element
    public  void addNode(int data)
    {
        // Create a new node
        Node node = new Node(data);
        if (this.root == null)
        {
            // When add first node in bst
            this.root = node;
        }
        else
        {
            Node find = this.root;
            // Add new node to proper position
            while (find != null)
            {
                if (find.data >= data)
                {
                    if (find.left == null)
                    {
                        // When left child empty
                        // So add new node here
                        find.left = node;
                        return;
                    }
                    else
                    {
                        // Otherwise
                        // Visit to left sub-tree
                        find = find.left;
                    }
                }
                else
                {
                    if (find.right == null)
                    {
                        // When right child empty
                        // So add new node here
                        find.right = node;
                        return;
                    }
                    else
                    {
                        // Visit to right sub-tree
                        find = find.right;
                    }
                }
            }
        }
    }
    public  static int leafSum(Node node)
    {
        if (node != null)
        {
            if (node.left == null && node.right == null)
            {
                // Case A
                // When node is leaf node
                // Change status
                alternate = !alternate;
                // Check node is alternate or not
                if (alternate)
                {
                    // When get alternate node
                    return node.data;
                }
            }
            else
            {
                // Case B
                // When node is internal
                // Visit left and right subtree and find alternate node
                return leafSum(node.left) +
                        leafSum(node.right);
            }
        }
        return 0;
    }

    public static int leafSumAlternate(Node root)
    {
        //Your code here
        alternate=false;
        return leafSum(root);
    }
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
		/*
			Binary search tree
		    -------------------
		       5
		      /  \
		     /    \
		    /      \
		   3        19
		  / \     /   \
		 2   4   8     31
		       / \    / \
		      7   15 25  50

		*/
        // Add tree node
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(19);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(8);
        tree.addNode(31);
        tree.addNode(7);
        tree.addNode(25);
        tree.addNode(15);
        tree.addNode(50);
        // Test
       // System.out.println(tree.alternateLeafSum());
    }
}