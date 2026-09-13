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
    List<String> l=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
        {
            return l;
        }
        dfs(root,String.valueOf(root.val));
        return l;
    }
    private void dfs(TreeNode root,String path)
    {
        if(root.right==null && root.left==null)
        {
            l.add(path);
            return;
        }
        if(root.left!=null)
        {
            dfs(root.left,path+"->"+root.left.val);
        }
        if(root.right!=null)
        {
            dfs(root.right,path+"->"+root.right.val);
        }
    }
}