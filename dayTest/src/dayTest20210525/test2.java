package dayTest20210525;

/**
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {20, 70, 110, 150},目标值为90
 * 输出 index1=1, index2=2
 */
import java.util.*;


public class test2 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            if(map.get(target - numbers[i]) != null){
                return new int[]{map.get(target - numbers[i])+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
}
