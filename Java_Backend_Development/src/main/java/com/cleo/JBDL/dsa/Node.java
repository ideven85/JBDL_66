package com.cleo.JBDL.dsa;

import java.util.ArrayList;

public  class Node {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }
class Problems{

    static Node insert(Node root, int val){
        if(root==null)
            root = new Node(val);
        if(val< root.data)
            root.left=insert(root.left,val);
        else if(val> root.data)
            root.right=insert(root.right,val);
        return root;
    }
private static     ArrayList<Integer> preOrder=null;
    static void preorder(Node root, ArrayList<Integer> preOrder){
        if(root!=null){
            preOrder.add(root.data);
            preorder(root.left,preOrder);
            preorder(root.right,preOrder);
        }
    }
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> answer = new ArrayList<>();
        preorder(root,answer);
        return answer;
    }
    int height(Node node)
    {
        // code here
        if(node==null)

            return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
        if(k>height(root))
            return 0;
        int depth=height(root)-k;


        return 0;

    }

    public static void main (String[] args) {
        Node root = new Node(3);
        insert(root,5);
        insert(root,7);
        System.out.println(preorder(root));
       // System.out.println(preOrder);
        System.out.println(preorder(root));
        System.out.println(preorder(root));

    }
}