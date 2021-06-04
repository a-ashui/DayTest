package dayTest20210603;

/**
 * 请实现有重复数字的升序数组的二分查找
 * 给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
 */
public class test1 {
    public static int search (int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                index = mid;
                high = mid-1;//可能有重复数字 查找第一个下标
            }else if (nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return index;
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,2,2,3,4};
//        System.out.println(search(arr,3));
//    }
}
