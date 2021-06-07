package dayTest20210607;

import java.util.Arrays;

/**
 * 给定无序数组arr，返回其中最长的连续序列的长度(要求值连续，位置可以不连续,例如 3,4,5,6为连续的自然数）
 *
 * 示例1
 * 输入：
 * [100,4,200,1,3,2]
 * 返回值：
 * 4
 *
 * 示例2
 * 输入：
 * [1,1,1]
 * 返回值：
 * 1
 */
public class test2 {
    public int MLS (int[] arr) {
        int count = 1;
        int result = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] == 1){
                count++;
            }else if(arr[i+1] - arr[i] == 0){
                continue;
            }else {
                count = 1;
            }
            result = Math.max(count,result);
        }
        return result;
    }
}
