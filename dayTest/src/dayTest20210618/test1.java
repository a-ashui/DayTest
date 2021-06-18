package dayTest20210618;

/**
 * 给定一个整数数组nums，按升序排序，数组中的元素各不相同。
 * nums数组在传递给search函数之前，会在预先未知的某个下标 t（0 <= t <= nums.length-1）上进行旋转，让数组变为[nums[t], nums[t+1], ..., nums[nums.length-1], nums[0], nums[1], ..., nums[t-1]]。
 * 比如，数组[0,2,4,6,8,10]在下标2处旋转之后变为[6,8,10,0,2,4]
 * 现在给定一个旋转后的数组nums和一个整数target，请你查找这个数组是不是存在这个target，如果存在，那么返回它的下标，如果不存在，返回-1
 *
 * 示例1
 * 输入：
 * [6,8,10,0,2,4],10
 *
 * 返回值：
 * 2
 */

public class test1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) >> 1;
        while(left<right){
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target && target <= nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
            mid = (left + right)>>1;
        }
        return nums[mid] == target?mid:-1;
    }
}
