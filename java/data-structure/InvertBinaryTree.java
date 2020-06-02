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
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp =  null;
            if(root.left !=null)
                temp = invertTree(root.left);
            if(root.right !=null)
                root.left =  invertTree(root.right);
            else
                root.left = null;
            root.right = temp;   
        }
        return root;
    }
}