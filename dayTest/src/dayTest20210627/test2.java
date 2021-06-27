package dayTest20210627;

/**
 * 描述
 * 给定一个无序数组arr, 其中元素可正、可负、可0。给定一个整数k，求arr所有子数组中累加和为k的最长子数组长度
 *
 * 示例1
 * 输入：
 * [1,-2,1,1,1],0
 * 返回值：
 * 3
 */
import java.util.*;


public class test2 {
    /**
     * max length of the subarray sum = k
     * @param arr int整型一维数组 the array
     * @param k int整型 target
     * @return int整型
     */
    public int maxlenEqualK (int[] arr, int k) {
        if(arr==null||arr.length==0) return 0;
        int sum=0;//记录从开头到第i个位置的总和
        HashMap<Integer,Integer>map=new HashMap<>();//记录每一个sum以及它出现的位置
        //基本思想是：如果第i个位置总和为a,第j个位置总和为b,那么在j位置时若发现b-a=k,则a-b之间就是总和为k的子数组
        map.put(0,-1);//初始化总和为0出现的位置
        int len=0;//最大长度
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)) len=Math.max(len,i-map.get(sum-k));
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        return len;
    }
}
