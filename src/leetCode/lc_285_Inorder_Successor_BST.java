package leetCode;



class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int val) {
        this.val = val;
    }
}
public class lc_285_Inorder_Successor_BST {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(5);
        root.left = new TreeNode1(3);
        root.right = new TreeNode1(6);
        root.left.left = new TreeNode1(2);
        root.left.right = new TreeNode1(4);
        root.left.left.left = new TreeNode1(1);
        TreeNode1 pValue = new TreeNode1(6);
        System.out.println(inorderSuccessor(root,pValue));

    }
    public static TreeNode1 inorderSuccessor(TreeNode1 root, TreeNode1 p) {
        TreeNode1 successor = null;
        while (root !=null) {
            if (root == null) return successor;
            if (root.val <= p.val) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }

        return successor;
    }

}
