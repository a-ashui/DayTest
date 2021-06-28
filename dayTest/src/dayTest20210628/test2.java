package dayTest20210628;

/**
 * 已知两颗二叉树，将它们合并成一颗二叉树。合并规则是：都存在的结点，就将结点值加起来，否则空的位置就由另一个树的结点来代替。例如：
 * 两颗二叉树是:
 * Tree 1
 *      1
 *     / \
 *    3   2
 *   /
 *  5
 *
 * Tree 2
 *    2
 *   / \
 *  1   3
 *   \   \
 *    4   7
 *
 * 合并后的树为
 *     3
 *    / \
 *   4   5
 *  / \    \
 * 5  4    7
 *
 *
 * 示例1
 * 输入：
 * {1,3,2,5},{2,1,3,#,4,#,7}
 * 返回值：
 * {3,4,5,5,4,#,7}
 */
public class test2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    
    /**
     *
     * @param t1 TreeNode类
     * @param t2 TreeNode类
     * @return TreeNode类
     */
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null || t2 == null) return t1 == null ? t2 : t1;
        // 此时 t1、t2 均不为 null
        // 合并节点的值
        t1.val = t1.val + t2.val;
        // 合并左子树
        t1.left = mergeTrees(t1.left, t2.left);
        // 合并右子树
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}