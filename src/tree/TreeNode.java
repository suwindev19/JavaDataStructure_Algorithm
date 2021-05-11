package tree;

public class TreeNode {
    int data;
    int hd; // height distance
    TreeNode left;
    TreeNode right;



    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {

    }
}
