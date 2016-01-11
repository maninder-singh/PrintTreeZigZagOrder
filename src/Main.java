import problem.ds.binarytree.Node;

public class Main {

    public static void main(String[] args) {

        Node tree = new Node( 20 );
        int[] data = {15, 200, 25, -5, 0, 100, 12, 126, 1000, -150};
        for(int i : data ) {
            tree.addNode(i);
        }

        Boolean isLeft = true;
        int height = tree.heightOfTree(tree);
        for (int index = 0;index < height ; index++){
            tree.printZigZagOrder(tree,index,isLeft);
            isLeft = !isLeft;
        }
    }
}
