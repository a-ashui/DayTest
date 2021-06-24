package dayTest20210624;

/**
 * 请写出一个高效的在m*n矩阵中判断目标值是否存在的算法，矩阵具有如下特征：
 * 每一行的数字都从左到右排序
 * 每一行的第一个数字都比上一行最后一个数字大
 * 例如：
 * 对于下面的矩阵：
 *
 * 例如：
 * 对于下面的矩阵：
 * [
 *     [1,   3,  5,  9],
 *     [10, 11, 12, 30],
 *     [230, 300, 350, 500]
 * ]
 * 要搜索的目标值为3，返回true；
 * 示例1
 * 输入：
 * [[1,3,5,9],[10,11,12,30],[230, 300, 350, 500]],3
 * 返回值：
 * true
 */
public class test1 {
    /*
     * 最优解法：Binary search on an ordered matrix
     * 二分查找
     * Runtime: 0 ms.Your runtime beats 75.27 % of java submissions
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m * n - 1;
        // 二分查找
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = matrix[mid / n][mid % n];
            if (target > value) {
                start = mid + 1;
            } else if (target < value)
                end = mid - 1;
            else
                return true;
        }
        return false;
    }

    /*
     * 解法二： Solution by me Runtime: 1 ms.Your runtime beats 6.66 % of java
     * submissions. 刚开始指向右上角元素，如果target大于该元素，下移；如果target小于该元素，左移；
     */
    public boolean searchMatrix_1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = 0, n = matrix[0].length - 1;
        // 避免角标越界
        while (m >= 0 && m < matrix.length && n >= 0 && n < matrix[0].length) {
            if (target > matrix[m][n])
                m++;
            else if (target < matrix[m][n])
                n--;
            else
                return true;
        }
        return false;

    }
}
