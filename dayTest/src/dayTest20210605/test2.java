package dayTest20210605;

/**
 * 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水。
 *
 * 示例1
 * 输入：
 * [3,1,2,5,2,4]
 * 返回值：
 * 5
 */

public class test2 {
    /**
     * max water
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public long maxWater (int[] arr) {
        // write code here
        int strat = 0;
        int end = arr.length-1;
        int i = strat;
        int j = end;
        long sum = 0;
        while(i<j){
            if(arr[strat] < arr[end]){
                if(arr[++i] < arr[strat]){
                    sum += arr[strat]-arr[i];
                }else{
                    strat = i;
                }
            }else{
                if(arr[--j] < arr[end]){
                    sum += arr[end] - arr[j];
                }else{
                    end = j;
                }
            }
        }
        return sum;
    }
}
