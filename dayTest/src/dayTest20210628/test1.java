package dayTest20210628;
/**
 * 给出n对括号，请编写一个函数来生成所有的由n对括号组成的合法组合。
 * 例如，给出n=3，解集为：
 * "((()))", "(()())", "(())()", "()()()", "()(())",
 * 示例1
 * 输入：
 * 1
 * 返回值：
 * ["()"]
 */

import java.util.*;

public class test1 {
    /**
     *
     * @param n int整型
     * @return string字符串ArrayList
     */
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        if(n < 1) return res;
        dfs(new StringBuilder(), n, n);
        return res;
    }
    private void dfs(StringBuilder sb,int left, int right) {
        //左右括号都用完了，返回
        if(left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }
        //先让左括号生成，然后再根据左括号的情况生成右括号
        if(left > 0) {
            sb.append("(");
            dfs(sb, left-1, right);
            sb.delete(sb.length()-1, sb.length());
        }
        if(right > 0 && right > left) {
            sb.append(")");
            dfs(sb,left,right-1);
            sb.delete(sb.length()-1, sb.length());
        }

    }
}
