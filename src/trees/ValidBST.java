package trees;

public class ValidBST {
    public static boolean isValid(TreeNode root,long min,long max){
        if (root.val<=min || root.val>=max){
            return false;
        }
        return isValid(root.left,min, (long) root.val) && isValid(root.right, (long) root.val,max);

    }
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
