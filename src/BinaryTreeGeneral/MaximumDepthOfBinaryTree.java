//Question: 104
//Given the root of a binary tree, return its maximum depth.
//
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


package BinaryTreeGeneral;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	
    	return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
