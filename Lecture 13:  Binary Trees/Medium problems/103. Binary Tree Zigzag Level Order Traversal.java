Date: 04.04.25
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null)return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //Setting the falg whcih will help in determining the direction of nodes to be added
        boolean flag = true;
        while(!queue.isEmpty()){ // loop will run until it is empty
            int size = queue.size(); // check the number of nodes in a particular level (required to traverse)
            List<Integer> row = new ArrayList <>(); // create a list in which the nodes will be stored in zig-zag manner
            for(int i=0; i<size; i++){ // traverse the nodes to enter in the row
                TreeNode node = queue.poll(); // get the front node from the queue
                
                // check for flag value according to which the nodes will be set at a certain index
                // int index =flag?i:(size-1-i);
                if (flag) {
                    row.addLast(node.val);
                } else {
                    row.addFirst(node.val);
                }
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            flag = !flag;
            ans.add(row);
        }             
        return ans;
        
    }
    
}
