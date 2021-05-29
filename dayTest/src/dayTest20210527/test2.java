package dayTest20210527;
/**
 * 给定一个数组arr，返回arr的最长无重复元素子数组的长度，无重复指的是所有数字都不相同。
 * 子数组是连续的，比如[1,3,5,7,9]的子数组有[1,3]，[3,5,7]等等，但是[1,3,7]不是子数组
 */
public class test2 {
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        int result = 0,start = 0;//result为之后结果，start为起点下标
        int[] end = new int[100000];//记录数组中数据的下标
        for(int i = 0; i < arr.length; i++) {
            int num=arr[i];
            if(start<end[num]){//如果该值的在end中存，则把起点设为相同值的下一个值的下标
                start=end[num];
            }
            if(result<i-start+1){//因为start为i+1,所以-start时要+1
                result=i-start+1;
            }
            end[num] = i+1;//向end数组里放下标
        }
        return result;
    }
}
