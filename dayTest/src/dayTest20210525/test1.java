package dayTest20210525;

/**
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
 */
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
public class test1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(k > arr.length || k == 0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.offer(arr[i]);
            } else if (maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }
}
