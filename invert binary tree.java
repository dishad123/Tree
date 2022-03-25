class Solution {
    
   
    public TreeNode invertTree(TreeNode root) {

if(root==null)
    return root;


TreeNode leftNode = invertTree(root.left);  //trversing the left node until null when it is null store in leftnode
TreeNode rightNode =invertTree( root.right);

root.left = rightNode;  //change the right node to left node
root.right=leftNode;

return root;
      
    }
}
