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
class Solution100 {
    private class TreeNode {
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        int val = 0;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkEqualTree(p, q);
    }

    private boolean checkEqualTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if((p == null && q != null) || (p != null && q == null)) return false;
        else if(p.val == q.val) {
            return checkEqualTree(p.left, q.left) && checkEqualTree(p.right, q.right);
        }
        else return false;
    }
}