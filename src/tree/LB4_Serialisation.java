package tree;

import java.util.ArrayList;

/*
Given root of a binary tree is given.
Task: Convert it into String or Array in such a way that you can construct a tree back from it.
Serialisation
==============================
Binary Tree -> Array, String
Array, String -> Binary Tree
==============================
Applications
- Tree Data structure - hierarchical information
- to send across the network, serialise it to string
- Binary tree problems - writing test cases, you need to produce a string , generation of test cases
- users use those

void serialise(Node *root, vector<int> &array) { };
Node *deSerialise(vector<int> &array) { };


Navie Approach
================
1. Store inorder traversal, preorder or postorder or levelorder or indorder
This solution requires two traversals of the tree.

Optimised Approach (Store only traversal)
=========================================
1.PreOrder Fare
-1 for Null
Assumption: -1 is not present in the given data set
            10
           /  \
          20   30
10, 20, -1, -1, 30, -1, -1
--------------------------------
            10
          /
         20
  10, 20, -1, -1, -1
--------------------------------
            10
           /
          20
         /
       30
         \
         40
 10, 20, 30, -1, -1, 40, -1,-1, -1, -1

// Serialisation - put it in a file,

        10
       /
      9
    serialise(10)
        serialise(9)
            serialise(NULL)
            serialise(NULL)
        serialise(NULL)
 */
public class LB4_Serialisation {
    static final int EMPTY = -1;
    public static void main(String[] args) {

    }

    void serialise(TreeNode root, ArrayList<Integer> array){
        if (root == null) {
            array.add(EMPTY);
            return;
        }

        array.add(root.data);
        serialise(root.left, array);
        serialise(root.right, array);
    }

    public String serialiseString(TreeNode root){
        if (root == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append(root.data).append(",");
        sb.append(serialiseString(root.left));
        sb.append(serialiseString(root.right));
        return sb.toString();
    }
}
