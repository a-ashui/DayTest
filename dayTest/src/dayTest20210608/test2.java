package dayTest20210608;

/**
 * 给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之和等于\ sum sum 的路径，
 * 例如：
 * 给出如下的二叉树，\ sum=22 sum=22，
 */
import java.util.*;





public class test2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return int整型ArrayList<ArrayList<>>
     */
    ArrayList<ArrayList<Integer>> results;
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here

        results = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return results;

        ArrayList<Integer> result = new ArrayList<Integer>();
        pathSum(root, 0, sum, result);

        return results;
    }
    public void pathSum(TreeNode root, int res, int sum, ArrayList<Integer> result) {
        if (root == null)
            return;
        else if (root.left == null && root.right == null) {
            if (res + root.val == sum) {
                result.add(root.val);
                results.add(new ArrayList<Integer>(result));
                result.remove(result.size()-1);
            }
        } else {
            result.add(root.val);
            pathSum(root.left, res + root.val, sum, result);
            pathSum(root.right, res + root.val, sum, result);
            result.remove(result.size()-1);
        }
    }
}
