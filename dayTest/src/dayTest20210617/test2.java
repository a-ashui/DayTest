package baiyong;

/**
 * 给出一个升序排序的数组，将其转化为平衡二叉搜索树（BST）.
 *
 * 示例1
 * 输入：
 * [-1,0,1,2]
 * 返回值：
 * {1,0,2,-1}
 */



public class test2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] num) {
        if(num == null || num.length == 0)return null;

        return createTree(num, 0, num.length - 1);
    }

    public TreeNode createTree(int[] num, int begin, int end){
        if(begin > end)
            return null;
        // 确定根的索引，这里一定要+1！
        int inx = (end + begin + 1) / 2;
        TreeNode root = new TreeNode(num[inx]);
        root.left = createTree(num, begin, inx - 1);
        root.right = createTree(num, inx + 1, end);
        return root;
    }
}
