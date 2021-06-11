package dayTest20210611;

/**
 * 给定一棵二叉树，判断其是否是自身的镜像（即：是否对称）
 * 例如：下面这棵二叉树是对称的
 * 1
 * /  \
 * 2    2
 * / \    / \
 * 3 4  4  3
 * 下面这棵二叉树不对称。
 * 1
 * / \
 * 2   2
 * \    \
 * 3    3
 */


public class test2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    boolean result = true;
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if(root == null)return true;
        jug(root.left,root.right);
        return result;
    }

    private void jug(TreeNode left,TreeNode right){
        if(left != null || right != null){
            if(left == null && right != null || left!=null && right == null){
                result = false;
                return;
            }
            if(left.val != right.val){
                result = false;
                return;
            }
            jug(left.left, right.right);
            jug(left.right, right.left);
        }
    }

}
