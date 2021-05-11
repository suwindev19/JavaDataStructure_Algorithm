package tree;

public class LB2_LowestCommonAncestorBT {
    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root,  TreeNode a, TreeNode b){
        if (root == null ) return null;
        if (root == a || root == b) return root;
        TreeNode left = lowestCommonAncestor(root.left, a, b);
        TreeNode right = lowestCommonAncestor(root.right, a,b);
        if (left !=null && right != null) return root;
        if (left == null && right == null) return null;
        return (left !=null) ? left : right;
    }
}
