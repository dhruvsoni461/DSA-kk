class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class Tree {
    Node root;
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.root = new Node(10);
        t1.root.left = new Node(20);
        t1.root.right = new Node(30);
        t1.root.left.left = new Node(40);
        t1.root.left.right = new Node(50);
    }
    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data+" ");
        inOrder(node.right);
    }
    boolean checkFBT(Node node){
        if(node == null) return true;
        else if (node.left == null && node.right == null) return true;
        else if (node.left!=null && node.right!=null) {
            return checkFBT(node.left) && checkFBT(node.right);
        }
        return false;
    }
    int depth(Node node){
        if(node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        return 1+Math.max(left, right);
    }
}