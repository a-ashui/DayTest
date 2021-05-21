package dayTest20210520;

/**
 * 给定一个全是正数的数组arr，定义一下arr的最小不可组成和的概念：
 * 1，arr的所有非空子集中，把每个子集内的所有元素加起来会出现很多的值，
 * 其中最小的记为min，最大的记为max；
 * 2，在区间[min,max]上，如果有一些正数不可以被arr某一个子集相加得到，
 * 那么这些正数中最小的那个，就是arr的最小不可组成和；
 * 3，在区间[min,max]上，如果所有的数都可以被arr的某一个子集相加得到，
 * 那么max+1是arr的最小不可组成和；
 * 举例： arr = {3,2,5} arr的min为2，max为10，在区间[2,10]上，
 * 4是不能被任何一个子集相加得到的值中最小的，所以4是arr的最小不可组成和；
 * arr = {3,2,4} arr的min为2，max为9，在区间[2,9]上，
 * 8是不能被任何一个子集相加得到的值中最小的，所以8是arr的最小不可组成和；
 * arr = {3,1,2} arr的min为1，max为6，在区间[2,6]上，
 * 任何数都可以被某一个子集相加得到，所以7是arr的最小不可组成和；
 * 请写函数返回arr的最小不可组成和。
 */
import java.util.*;

public class test1 {
    public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int value: arr){
            if (value < min) min = value;
            max += value;
        }
        Arrays.sort(arr);
        BitSet[] table = new BitSet[arr.length];
        for(int i=0;i<table.length;i++){
            table[i] = new BitSet(max-min+1);
        }


        table[0].set(arr[0]-min);

        for(int i=1;i<arr.length;i++){ //array[i]
            table[i].set(arr[i]-min); //设置当前列的值arr[i],注意偏移
            for(int j=min;j<=max;j++){
                if(table[i-1].get(j-min)){
                    table[i].set(j-min); //继承上一行的值
                    if(j+arr[i]<=max) table[i].set(j+arr[i]-min); //上一行值加上这个值产生的新值
                }
            }
        }

        for(int j=min;j<=max;j++){
            if(!table[arr.length-1].get(j-min)) return j;
        }
        return max+1;
    }
}
