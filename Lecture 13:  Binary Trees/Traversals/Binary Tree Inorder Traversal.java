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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); // to store the answer
        helper(root, ans); // function call
        return ans; // return the ans
    }
    private void helper(TreeNode node , List ans){
        if(node==null)return; // if node is null return
        helper(node.left,ans); // first travers the left until it is null
        ans.add(node.val); // after recursion for left is done, add the value subsequently
        helper(node.right,ans); // once done for left do for right
    }
}
