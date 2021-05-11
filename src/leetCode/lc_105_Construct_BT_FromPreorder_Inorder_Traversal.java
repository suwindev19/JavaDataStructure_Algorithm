package leetCode;

import tree.TreeNode;

public class lc_105_Construct_BT_FromPreorder_Inorder_Traversal {
    public static void main(String[] args) {

    }
    // return the root of the tree
//    public static TreeNode buildTree(int[] preorder, int[] inorder){
//        return helper(0, 0, inorder.length-1, preorder, inorder);
//    }

    // preStart : index of root node (to keep track of root position)
    // intStart, intEnd boundary for inorder array
    //
//    public static TreeNode helper(int preStart, int intStart, int intEnd,int[] preorder, int[] inorder ){
//        // Check boundary
//        if (preStart > preorder.length-1 || intStart > intEnd) return null;
//        TreeNode root = new TreeNode(preorder[preStart]);
//        // Find that node in the inorder array
//        int inIndex =0;
////        for(int i = intStart; i < intEnd; i++){
////            if (root.data == inorder[i]){
////                inIndex = i;
////            }
////        }
////        root.left = helper(preStart+1, intStart, inIndex-1, preorder, inorder);
////        root.right = helper(preStart+inIndex - intStart + 1, inIndex+1, intEnd, preorder, inorder);
////        return root;
//    }
}
