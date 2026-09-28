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
    public boolean mir(TreeNode l, TreeNode r){
        if(l == null && r == null){
            return true;
        }

        if(l == null || r == null){
            return false;
        }

        if(l.val != r.val){
            return false;
        }

        return mir(l.left,r.right) && mir(l.right,r.left);
    }
    public boolean isSymmetric(TreeNode r) {
        if(r ==  null){
            return true;
        }
        return mir(r.left,r.right);
    }
}