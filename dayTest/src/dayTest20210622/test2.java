package dayTest20210622;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 现在有一个没有重复元素的整数集合S，求S的所有子集
 * 注意：
 * 你给出的子集中的元素必须按升序排列
 * 给出的解集中不能出现重复的元素
 *
 * 输入：
 * [1,2,3]
 * 返回值：
 * [[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]]
 */

public class test2{
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int j=0;j<=nums.length;j++)
            backtracking(nums,j,0,list);
        return result;
    }
    public void backtracking(int[] nums,int k,int start,List<Integer> list){
        if(k<0)    return;
        else if(k==0)
            result.add(new ArrayList(list));
        else{
            for(int i=start;i<nums.length;i++){
                list.add(nums[i]);
                backtracking(nums,k-1,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
}
