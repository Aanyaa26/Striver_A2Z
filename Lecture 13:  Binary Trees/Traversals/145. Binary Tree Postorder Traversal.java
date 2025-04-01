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
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList<>();
        Function(root, ans);
        return ans; 
    }
    private void Function(TreeNode node, List ans){
        if(node==null)return;

        Function(node.left,ans);
        Function(node.right,ans);
        ans.add(node.val);
    }
}
