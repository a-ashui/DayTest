package baiyong;

/**
 * 给定一个二叉树，请计算节点值之和最大的路径的节点值之和是多少。
 * 这个路径的开始节点和结束节点可以是二叉树中的任意节点
 * 返回的结果为6
 *
 *
 */

public class test1 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    private int maxPathDown(TreeNode node){
        if(node==null)return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
