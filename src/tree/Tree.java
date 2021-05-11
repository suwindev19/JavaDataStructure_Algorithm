package tree;
import java.util.*;

public class Tree {
    TreeNode root;
    Tree(){
        this.root = null;
    }

    public void insertDataLeft(int data){
        if (root == null)
            root = new TreeNode(data);
        else{
            TreeNode curr = root;
            TreeNode parent = root;
            while (curr !=null){
                parent = curr;
                curr = curr.left;
            }
            parent.left = new TreeNode(data);
        }
    }

    public void insertDataRight(int data){
        if (root == null)
            root = new TreeNode(data);
        else {
            TreeNode curr = root;
            TreeNode parent = root;
            while (curr!=null){
                parent = curr;
                curr = curr.right;
            }
            parent.right = new TreeNode(data);
        }
    }

    public void insertData(int data){
        TreeNode newNode = new TreeNode(data);
        if (root == null)
            root = newNode;
        else {
            TreeNode curr = root;
            TreeNode parent = root;
            while (curr !=null){
                parent = curr;
                if (data < curr.data) {
                    curr = curr.left;
                    if (curr == null){
                        parent.left = newNode;
                        return;
                    } else{
                        curr = curr.right;
                        if (curr == null){
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }
    }

    // Depth First Search - PreOrder Recursive method
    public static List<Integer> preOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.data);
        list.addAll(preOrder(root.left));
        list.addAll(preOrder(root.right));
        return list;
    }

    public static List<Integer> preOrder_Iterative(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if (root == null) return list;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.poll();
            list.add(node.data);
            if (node.right !=null){
                stack.add(node.right);
            }
            if (node.left !=null){
                stack.add(node.left);
            }
        }
        return list;
    }

    public static List<Integer> inOrder_Recursive(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.addAll(inOrder_Recursive(root.left));
        list.add(root.data);
        list.addAll(inOrder_Recursive(root.right));
        return list;
    }

    public static List<Integer> inOrder_Iterative(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return list;
        TreeNode node = root;
        while (node !=null || !stack.isEmpty()){
            while (node!=null){
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.data);
            node = node.right;
        }
        return list;
    }

    public static List<Integer> postOrder_Recursive(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.addAll(postOrder_Recursive(root.left));
        list.addAll(postOrder_Recursive(root.right));
        list.add(root.data);
        return list;
    }

    public static List<Integer> postOrder_Iterative(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while ( !stack.isEmpty()) {
            stack.push(stack.pop());
            if (root.left !=null)
                stack.push(root.left);
            if (root.right !=null)
                stack.push(root.right);
        }
        return list;
    }

    public static int countFullNode(TreeNode root){
        if (root == null) return 0;
        if (root.left !=null && root.right !=null){
            return 1 + countFullNode(root.left) + countFullNode(root.right);
        }
        return 0;
    }

    // Time O(n)
    public static int countAllNode(TreeNode root){
        if (root == null) return 0;
        return 1 + countAllNode(root.left) + countAllNode(root.right);
    }

    /*
    1. calculate the height(h)
    2. Total Nodes = 2^h - 1 for full binary tree
    Therefore O(logn)
    Complete Binary Tree

    At the root,
    go left, calculate height (subtree)
    go right, calculate height (subtree)
    if left != right


     */
    // Time log(n) to calculate height, right most node of right level
    // log(n) x Log(n)
    public static int countAllNode_Iterative(TreeNode root){
        if (root == null) return 0;
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);
        if (leftHeight == rightHeight){
            return (int)Math.pow(2,leftHeight)-1;
        }
        return countAllNode_Iterative(root.left) + countAllNode_Iterative(root.right) +1;
    }

    public static int leftHeight(TreeNode root){
        if (root == null) return 0;
        return leftHeight(root.left) + 1;
    }

    public static int rightHeight(TreeNode root){
        if (root == null) return 0;
        return rightHeight(root.right) + 1;
    }

    public static int countLeafNode(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    public static int countHalfLeaf(TreeNode root){
        if (root == null) return 0;
        if ((root.right == null && root.left != null) || (root.left == null && root.right !=null))
            return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    public static void main(String[] args) {


    }
}
