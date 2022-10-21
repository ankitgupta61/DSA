package Mock;

public class BST {
    public static Node constructBST(int[] arr, int s, int e){
        if(s <= e) {
            int m = s + (e - s) / 2;
            Node root = new Node(arr[m]);
            root.left = constructBST(arr, s, m - 1);
            root.right = constructBST(arr, m + 1, e);
            return root;
        }
        return null;
//        MERN de
//        Basics CSE subjects
//        project : full stack unique good
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        Node root = constructBST(arr, 0,arr.length-1);
        System.out.println(root.left.data);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
