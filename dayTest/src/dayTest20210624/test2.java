package dayTest20210624;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 求给定二叉树的最大深度，
 * 最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。
 *
 *示例1
 * 输入：
 * {1,2}
 * 返回值：
 * 2
 */


public class test2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    /*
     * 解法一：
     * 递归解法，非常简洁
     */
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }



    /*
     * 解法二： 使用queue进行层序遍历
     */
    public int maxDepth_1(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int res = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res++;
        }

        return res;
    }
}
