package tree;

public class LB1_TreeHeight {
    public static void main(String[] args) {

    }

    public static int maxTreeHeight(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left = 1 + maxTreeHeight(root.left);
        int right = 1 + maxTreeHeight(root.right);
        if (left > right)
            return left;
        else
            return right;
    }
}
