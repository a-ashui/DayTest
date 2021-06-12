package beiyong2;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 示例1
 * 输入：
 * ["abca","abc","abca","abc","abcc"]
 * 返回值："abc"
 */

public class test2 {
    /**
     *
     * @param strs string字符串一维数组
     * @return string字符串
     */
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs == null || strs.length == 0)return "";
        int maxindex = strs[0].length()-1;
        for(int i = 1;i<strs.length;i++){
            int idx = -1;
            while(idx < maxindex && idx < strs[i].length() -1){
                if(strs[0].charAt(idx + 1) == strs[i].charAt(idx + 1)){
                    idx++;
                }else{
                    break;
                }
            }
            if(idx == -1)return "";
            maxindex = idx;
        }
        return strs[0].substring(0,maxindex+1);
    }
}
