package beiyong4;

import java.util.Arrays;

/**
 * 给定一个数组由一些非负整数组成，现需要将他们进行排列并拼接，使得最后的结果最大，返回值需要是string类型 否则可能会溢出
 *
 * 示例1
 * 输入：
 * [30,1]
 * 返回值：
 * "301"
 */
public class test1 {
    public String solve (int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums);
        }
        Arrays.sort(strArr,(o1,o2)->Integer.parseInt(o2+o1)-Integer.parseInt(o1+o2));
        StringBuilder maxString = new StringBuilder();
        if(strArr[0].equals("0")){
            return "0";
        }
        for (int i = 0; i < strArr.length; i++) {
            maxString.append(strArr[i]);
        }
        return maxString.toString();
    }
}
