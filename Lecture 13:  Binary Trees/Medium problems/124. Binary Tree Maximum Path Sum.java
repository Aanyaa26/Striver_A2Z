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
    public int maxPathSum(TreeNode root) {
        int [] ans = new int [1];
        ans[0] = Integer.MIN_VALUE;
        maxpath(root,ans);
        return ans[0];
    }
    public int maxpath(TreeNode node, int[]ans){
        if(node==null)return 0;

        int left = Math.max(0,maxpath(node.left,ans));
        int right = Math.max(0,maxpath(node.right,ans));
        ans[0]= Math.max(ans[0],left+right+node.val);
        return node.val+Math.max(right,left);
    }
}
