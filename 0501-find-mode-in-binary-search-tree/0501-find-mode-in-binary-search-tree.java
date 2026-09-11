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
    int c=0;
    TreeNode prev=null;
    int mc=0;
    List<Integer> l=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
       
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            arr[i]=l.get(i);
        }
        return arr;
    }
    private void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && root.val==prev.val)
        {
            c++;
        }
        else
        {
            c=1;
        }
        if(c>mc)
        {
            mc=c;
            l.clear();
            l.add(root.val);
        }
        else if(mc==c)
        {
            l.add(root.val);
        }
        prev=root;
        inorder(root.right);
    }
}