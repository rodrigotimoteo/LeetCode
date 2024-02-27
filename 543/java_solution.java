/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution543 {
    private class TreeNode {
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
    }

    int width = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        countSides(root);
        return width;
    }

    private int countSides(TreeNode side) {
        if(side == null) return 0;
        
        int leftWidth = countSides(side.left);
        int rightWidth = countSides(side.right);

        width = Math.max(width, leftWidth + rightWidth);

        return Math.max(leftWidth, rightWidth) + 1;
    }
}