package dayTest20210602;

/**
 * 给出一个有n个元素的数组S，S中是否有元素a,b,c满足a+b+c=0？找出数组S中所有满足条件的三元组。
 * 注意：
 * 三元组（a、b、c）中的元素必须按非降序排列。（即a≤b≤c）
 * 解集中不能包含重复的三元组。
 *
 * 输入：
 * [-2,0,1,1,2]
 * 返回值：
 * [[-2,0,2],[-2,1,1]]
 */
import java.util.ArrayList;
import java.util.Arrays;
public class test2 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(num == null)return result;
        Arrays.sort(num);
        int sum,left,right;
        for(int i = 0;i<num.length;i++){
            if(i != 0 && num[i] == num[i-1]){
                continue;
            }
            left = i + 1;
            right = num.length - 1;
            while(left < right){
                sum = num[left] + num[right];
                if(sum + num[i] == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && num[left] == num[left-1]){
                        left++;
                    }
                    while(left < right && num[right] == num[right+1]){
                        right--;
                    }
                }else if(sum + num[i] < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
