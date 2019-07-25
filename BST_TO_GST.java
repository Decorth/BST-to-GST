/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/* Since the number of nodes in the tree is between 1 to 100, we can use a recursive solution that uses stack memory
rather than needing to have the full capacity of the ram (in an iterative solution)

*/


class Solution {

    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {

        if (root == null){
            return root;
        }
        bstToGst(root.right);
        sum = sum + root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }
}
