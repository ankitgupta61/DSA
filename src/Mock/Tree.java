package Mock;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
   public static void levelOrderTraversal(Node root){
       Queue<Node> que = new LinkedList<>();
       que.add(root);
//       System.out.println("hello");

       while(!que.isEmpty()){
           if(que.peek().left != null){
               que.add(que.peek().left);
           }
           if(que.peek().right != null){
               que.add(que.peek().right);
           }
           System.out.print(que.poll().data + " ");
       }

   }

    public static void main(String[] args) {
    int[] arr = {100, 50, 200, 25, 75, 350};
    Node root = new Node(100);
    root.left = new Node(50);
    root.right = new Node(200);
    root.left.left = new Node(25);
    root.left.right = new Node(75);
    root.right.left = new Node(350);

    levelOrderTraversal(root);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
}

