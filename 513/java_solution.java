import java.util.LinkedList;
import java.util.Queue;

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
class Solution513 {
    private class TreeNode {
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        int val;
    }

    TreeNode temporary;

    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            temporary = queue.poll();

            if(temporary.right != null) queue.offer(temporary.right);
            if(temporary.left != null) queue.offer(temporary.left);
        }

        return temporary.val;
    } 
}