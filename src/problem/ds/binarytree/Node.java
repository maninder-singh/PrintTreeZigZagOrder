package problem.ds.binarytree;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void addNode(int num) {
        if (num < this.data) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new Node(num);
            }
        } else {
            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new Node(num);
            }
        }
    }

    public void printZigZagOrder(Node node, int level, Boolean isLeft){
        if(node == null) return;

        if (level == 0)
            System.out.println(node.getData());

        if(isLeft){
            printZigZagOrder(node.getLeft(), level - 1, isLeft);
            printZigZagOrder(node.getRight(), level - 1, isLeft);
        }
        else{
            printZigZagOrder(node.getRight(), level - 1, isLeft);
            printZigZagOrder(node.getLeft(), level - 1, isLeft);
        }
    }

    public int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        else {
            return 1 + Math.max(heightOfTree(root.getLeft()),heightOfTree(root.getRight()));
        }
    }
}