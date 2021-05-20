package dayTest20210519;

/**
 * 给定一个长度不小于2的数组arr。 写一个函数调整arr，使arr中要么所有的偶数位上都是偶数，
 * 要么所有的奇数位上都是奇数上。 要求：如果数组长度为N，时间复杂度请达到O(N)，
 * 额外空间复杂度请达到O(1),下标0,2,4,6...算作偶数位,下标1,3,5,7...算作奇数位，
 * 例如[1,2,3,4]调整为[2,1,4,3]即可
 */
public class test1 {
    public void oddInOddEvenInEven(int[] arr) {
        if(arr.length<2 || arr == null)return;
        int o = 0;
        int end = arr.length - 1;
        int j = 1;
        while(o <= end && j <= end){
            if(arr[end] % 2 == 0){
                swap(arr,end,o);
                o+=2;
            }else{
                swap(arr,end,j);
                j+=2;
            }
        }
    }
    public void swap(int[] arr,int o, int j){
        int tmp = arr[o];
        arr[o] = arr[j];
        arr[j] = tmp;
    }
}