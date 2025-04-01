Date: 01.04.25
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        // function call
        function(root, ans);
        return ans;
    }
    private void function(TreeNode node, ArrayList ans){
        if(node==null)return;
        ans.add(node.val);
        function(node.left, ans);
        function(node.right,ans);
    }
}
