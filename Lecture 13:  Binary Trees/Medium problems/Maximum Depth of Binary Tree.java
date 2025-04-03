Date: 03.04.25
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
class Solution {
    public int maxDepth(TreeNode root) {
        if(root ==null)return 0;

        int left = maxDepth(root.left); // to count if a node has left, move else - returna vlaue
        int right = maxDepth(root.right); // to count if a node has right, move else- return a value

        return 1+Math.max(left,right); // value = 1+(left,right)
    }
}
