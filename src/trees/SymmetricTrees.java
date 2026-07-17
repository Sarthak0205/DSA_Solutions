package trees;

public class SymmetricTrees {
    private boolean isMirror(TreeNode left,TreeNode right){
        if (left==null && right==null) return true;
        if (left==null || right==null) return false;
        if (left.val!=right.val) return true;

        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isMirror(root.left,root.right);
    }
}
