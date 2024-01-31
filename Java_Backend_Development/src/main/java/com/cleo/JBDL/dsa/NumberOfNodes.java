package com.cleo.JBDL.dsa;

import java.util.*;

public class NumberOfNodes {
    static class Pair{
        Node current;
        int depth;

        public Pair (Node current, int depth) {
            this.current = current;
            this.depth = depth;
        }
    }
    int getNumNodesAtLevel(Node root, int lvl) {
        // Code here
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();
        queue.offer(root);
        queue.offer(null);
        List<Integer> temp = new ArrayList<>();
        while(!queue.isEmpty()){
            Node current = queue.poll();
            //temp.add(current);
            if(current!=null) {
                temp.add(current.data);
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }else{
                List<Integer> current1 = new ArrayList<>(temp);
                answer.add(current1);
                temp.clear();
                if(!queue.isEmpty())
                    queue.offer(null);
            }
        }
        return lvl<answer.size()?answer.get(lvl).size():0;
    }
    private final List<Node> inOrder = new ArrayList<>();
    private final List<Integer> subTreeValues = new ArrayList<>();


    public void inOrder(Node root){
        if(root!=null){
            inOrder.add(root);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
    private void inOrderTraversal(Node node){
        if(node!=null){
            subTreeValues.add(node.data);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }
    int median(Node root, int k) {
        if(root==null)return -1;
        // Code here
//        inOrder(root);
//        Node targetNode = inOrder.get(k-1);
//        int median=0;
        inOrderTraversal(root);

        if(subTreeValues.isEmpty())
            return 0;
       //Collections.sort(subTreeValues);
        if(k>=subTreeValues.size())
            return 0;
        int kthSmallest = subTreeValues.get(k-1);
        int[] values = new int[subTreeValues.size()-k+1];
        int j=0;
        for (int i = kthSmallest; i < subTreeValues.size(); i++) {
            values[j++]= subTreeValues.get(i);
        }
        int size=values.length;


//        if(size==1)
//            return subTreeValues.get(0);
        int mid=size/2;
        if(size%2==0)
            return (values[mid]+values[mid-1])/2;
        else
            return values[mid];



    }
//    public List<List<Integer>> levelOrder(Node root) {
//        Queue<Node> queue = new LinkedList<>();
//        List<List<Integer>> answer = new ArrayList<>();
//        queue.offer(root);
//        queue.offer(null);
//        List<Integer> temp = new ArrayList<>();
//        while(!queue.isEmpty()){
//            Node current = queue.poll();
//            //temp.add(current);
//            if(current!=null) {
//                temp.add(current.data);
//                if (current.left != null)
//                    queue.offer(current.left);
//                if (current.right != null)
//                    queue.offer(current.right);
//            }else{
//                List<Integer> current1 = new ArrayList<>(temp);
//                answer.add(current1);
//                temp.clear();
//                if(!queue.isEmpty())
//                    queue.offer(null);
//            }
//        }
//        return answer;
//
//    }


    public static void main (String[] args) {
        
    }
}
